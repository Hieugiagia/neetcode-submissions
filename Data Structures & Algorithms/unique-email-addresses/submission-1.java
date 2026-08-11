

class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for (String email : emails) {

            String[] parts = email.split("@");

            String local = parts[0];
            String domain = parts[1];

            // Xử lý dấu +
            int plus = local.indexOf('+');

            if (plus != -1) {
                local = local.substring(0, plus);
            }

            // Xóa dấu .
            local = local.replace(".", "");

            // Tạo email sau khi chuẩn hóa
            String normalized = local + "@" + domain;

            set.add(normalized);
        }

        return set.size();
    }
}
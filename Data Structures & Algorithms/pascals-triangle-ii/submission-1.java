

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();

        result.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {
                List<Integer> prev = result;

                row.add(prev.get(j - 1) + prev.get(j));
            }

            row.add(1);

            result = row;
        }

        return result;
    }
}
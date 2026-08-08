class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            // Kiểm tra ô hiện tại có trống không
            if (flowerbed[i] == 0) {

                // Kiểm tra bên trái
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);

                // Kiểm tra bên phải
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // Nếu cả hai bên đều trống thì trồng hoa
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}
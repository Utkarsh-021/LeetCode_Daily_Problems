class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if (cardPoints == null || k <= 0 || k > cardPoints.length) return 0;
        if (k == cardPoints.length) return Arrays.stream(cardPoints).sum();
        int maxPoints = Integer.MIN_VALUE;
        int[] left = new int[k+1];
        for (int i = 1; i <= k; i++) {
            left[i] = left[i-1] + cardPoints[i-1];
        }
        int[] right = new int[k+1];
        for (int i = 1; i <= k; i++) {
            right[i] = right[i-1] + cardPoints[cardPoints.length-i];
        }
        for (int i = 0; i <= k; i++) {
            maxPoints = Math.max(maxPoints, left[i] + right[k-i]);
        }
        return maxPoints;
    }
}
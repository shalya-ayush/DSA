class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        buying_price = prices[0]
        profit = 0

        for i in range(1, len(prices)):

            if prices[i] < buying_price:
                buying_price = prices[i]
            
            elif prices[i] - buying_price > profit:
                profit = prices[i] - buying_price

        return profit
        
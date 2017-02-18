package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c > r) throw new Exception("Incorrect Input")

      def pascalAlg(c: Int, r: Int): Int = {
        if (c == 0 || (c == r) || (r == 0))
          1
        else
          pascal(c - 1, r - 1) + (pascal (c, r - 1))
      }

      pascalAlg(c, r)
    }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def balanceAlg(chars: List[Char], cont: Int): Boolean = {
        if (cont < 0) return false

        if (chars.isEmpty) {
          cont == 0
        } else {
          var value : Char = chars.head;
          if (value.equals('('))  balanceAlg(chars.tail, cont + 1)
          else if (value.equals(')')) balanceAlg(chars.tail, cont - 1)
          else  balanceAlg(chars.tail, cont)
        }
      }

      balanceAlg(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0 || coins.isEmpty) 0
      else if (money <= 0 && !coins.isEmpty) 0
      else countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }

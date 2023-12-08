package etc
class Solution {
    fun solution(n: Int): Boolean {
        var answer = false
        var hap:Int =0
        var arr = n.toString().toList()
        arr.forEach(){
            hap += it.toString().toInt()
        }
        if(n % hap == 0)
            answer=true
        return answer
    }
}
fun main()
{
    var s = Solution()
    println(s.solution(13))
}
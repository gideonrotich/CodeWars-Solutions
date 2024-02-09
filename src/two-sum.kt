fun main(){
    twoSum(intArrayOf(1, 2, 3, 4, 5, 6),9)

}

fun twoSum(arr: IntArray, target: Int): Pair<Int, Int>? {
   var answer  = Pair(0,0)

    for(i in arr.indices){
        for(j in i+1 until arr.size){
            if(arr[i]+arr[j] == target){
                answer = Pair(arr[i],arr[j])
            }
        }
    }

    println(answer.first)
    println(answer.second)

    return answer
}
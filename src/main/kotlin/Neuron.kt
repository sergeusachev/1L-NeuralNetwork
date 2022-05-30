class Neuron {

    var input: IntArray? = null
    var learningInput: IntArray? = null
    var isLearned = false
    var output = Int.MAX_VALUE
    private var prevCorrection = Int.MAX_VALUE
    private val corrections = IntArray(26)
    private var weightedSum = 0

    init {
        for (i in 0 until 26) {
            corrections[i] = 0
        }
    }

    fun sumInputs() {
        weightedSum = calcWeightedSum()
    }

    fun activate() {
        output = if (weightedSum >= corrections[0]) 1 else 0
        weightedSum = 0
    }

    fun correctWeights(resultReference: Int) {
        val currentCorrection = resultReference - output

        for (i in corrections.indices) {
            val delta = when {
                resultReference == 1 && output == 0 -> 1
                resultReference == 0 && output == 1 -> -1
                resultReference == output -> 0
                else -> throw RuntimeException("Invalid delta calculation")
            }
            corrections[i] += (delta * learningInput!![i])
        }

        isLearned = (currentCorrection == 0) && (prevCorrection == 0)
        prevCorrection = currentCorrection
    }

    private fun calcWeightedSum(): Int {
        var weightedSum = 0
        if (isLearningMode()) {
            learningInput!!.forEachIndexed { index, input ->
                weightedSum += input * corrections[index]
            }
        } else {
            input!!.forEachIndexed { index, input ->
                weightedSum += input * corrections[index]
            }
        }

        return weightedSum
    }

    private fun isLearningMode() = if (learningInput == null && input != null) {
        false
    } else if (learningInput != null && input == null) {
        true
    } else {
        throw RuntimeException("Not valid input state")
    }
}
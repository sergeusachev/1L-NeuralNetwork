fun main() {

    val neuralNetwork = arrayOf(
        Neuron(),
        Neuron(),
        Neuron(),
        Neuron()
    )

    println("Обучение сети...")
    while (!isNetworkLearned(neuralNetwork)) {
        learningSet2.forEachIndexed { i, learningItem ->
            neuralNetwork.forEachIndexed { n, neuron ->
                neuron.apply {
                    input = null
                    learningInput = learningItem.first.first
                    sumInputs()
                    activate()
                    correctWeights(learningItem.second[n])
                }
            }
        }
    }

    println("Распознавание образов:")
    testSet.forEachIndexed { i, symbol ->
        print("Распознавание ${symbol.second} Рез: ")
        neuralNetwork.forEachIndexed { n, neuron ->
            neuron.apply {
                input = symbol.first
                learningInput = null
                sumInputs()
                activate()
                print(output)
            }
        }
        println()
    }
}

fun isNetworkLearned(neuralNetwork: Array<Neuron>): Boolean {
    for (i in neuralNetwork.indices) {
        if (!neuralNetwork[i].isLearned) return false
    }

    return true
}
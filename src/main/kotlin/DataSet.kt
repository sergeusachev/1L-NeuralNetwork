
val input1 = intArrayOf(1, *char1) to "Буква А(-0010-)"
val input2 = intArrayOf(1, *char19) to "Буква С(-0100-)"
val input3 = intArrayOf(1, *char21) to "Буква У(-1000-)"
val input4 = intArrayOf(1, *char2) to "Буква Б(-0000-)"
val input5 = intArrayOf(1, *char3) to "Буква В(-0000-)"
val input6 = intArrayOf(1, *char4) to "Буква Г(-0000-)"
val input7 = intArrayOf(1, *char5) to "Буква Д(-0000-)"
val input8 = intArrayOf(1, *char6) to "Буква Е(-0000-)"
val input9 = intArrayOf(1, *char15) to "Буква Н(-0000-)"
val input10 = intArrayOf(1, *char16) to "Буква О(-0000-)"
val input11 = intArrayOf(1, *char17) to "Буква П(-0000-)"
val input12 = intArrayOf(1, *num13) to "Число 13(-0001-)"


val testSet = listOf(
    input4,
    input5,
    input6,
    input7,
    input8,
    input9,
    input10,
    input11,

    input12,
    input1,
    input2,
    input3,
)

val learningSet2 = listOf(
    input1 to intArrayOf(0, 0, 1, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input3 to intArrayOf(1, 0, 0, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input3 to intArrayOf(1, 0, 0, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input2 to intArrayOf(0, 1, 0, 0),
    input3 to intArrayOf(1, 0, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input3 to intArrayOf(1, 0, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input1 to intArrayOf(0, 0, 1, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input3 to intArrayOf(1, 0, 0, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input3 to intArrayOf(1, 0, 0, 0),
    input4 to intArrayOf(0, 0, 0, 0),
    input5 to intArrayOf(0, 0, 0, 0),
    input6 to intArrayOf(0, 0, 0, 0),
    input7 to intArrayOf(0, 0, 0, 0),
    input8 to intArrayOf(0, 0, 0, 0),
    input9 to intArrayOf(0, 0, 0, 0),
    input10 to intArrayOf(0, 0, 0, 0),
    input11 to intArrayOf(0, 0, 0, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input2 to intArrayOf(0, 1, 0, 0),
    input3 to intArrayOf(1, 0, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input3 to intArrayOf(1, 0, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input1 to intArrayOf(0, 0, 1, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input3 to intArrayOf(1, 0, 0, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input4 to intArrayOf(0, 0, 0, 0),
    input5 to intArrayOf(0, 0, 0, 0),
    input6 to intArrayOf(0, 0, 0, 0),
    input7 to intArrayOf(0, 0, 0, 0),
    input8 to intArrayOf(0, 0, 0, 0),
    input9 to intArrayOf(0, 0, 0, 0),
    input10 to intArrayOf(0, 0, 0, 0),
    input11 to intArrayOf(0, 0, 0, 0),
    input3 to intArrayOf(1, 0, 0, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input2 to intArrayOf(0, 1, 0, 0),
    input3 to intArrayOf(1, 0, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input4 to intArrayOf(0, 0, 0, 0),
    input5 to intArrayOf(0, 0, 0, 0),
    input6 to intArrayOf(0, 0, 0, 0),
    input7 to intArrayOf(0, 0, 0, 0),
    input8 to intArrayOf(0, 0, 0, 0),
    input9 to intArrayOf(0, 0, 0, 0),
    input10 to intArrayOf(0, 0, 0, 0),
    input11 to intArrayOf(0, 0, 0, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input3 to intArrayOf(1, 0, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input1 to intArrayOf(0, 0, 1, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input3 to intArrayOf(1, 0, 0, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input3 to intArrayOf(1, 0, 0, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input2 to intArrayOf(0, 1, 0, 0),
    input3 to intArrayOf(1, 0, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input2 to intArrayOf(0, 1, 0, 0),
    input12 to intArrayOf(0, 0, 0, 1),
    input3 to intArrayOf(1, 0, 0, 0),
    input4 to intArrayOf(0, 0, 0, 0),
    input5 to intArrayOf(0, 0, 0, 0),
    input6 to intArrayOf(0, 0, 0, 0),
    input7 to intArrayOf(0, 0, 0, 0),
    input8 to intArrayOf(0, 0, 0, 0),
    input9 to intArrayOf(0, 0, 0, 0),
    input10 to intArrayOf(0, 0, 0, 0),
    input11 to intArrayOf(0, 0, 0, 0),
    input1 to intArrayOf(0, 0, 1, 0),
    input12 to intArrayOf(0, 0, 0, 1),
)
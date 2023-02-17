class Main {

    static void main(String[] args) {
        def numberArray = [1, 3, 4, 5, 1, 5, 4]
        def countString = countElements(numberArray);
        println countString
    }

        static String countElements(def numberArray){
        def countingMap = [:]

        for (number in numberArray) {
            if (countingMap[number]) {
                countingMap[number] = countingMap[number] + 1
            } else
                countingMap[number] = 1
        }
        return countingMap.toString().replaceAll("\\[", "{")
                .replaceAll("]", "}").replaceAll(":", " : ")
    }
}
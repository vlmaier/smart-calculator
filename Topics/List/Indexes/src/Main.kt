fun solution(products: List<String>, product: String) {
    products.forEachIndexed { i, p ->
        if (p == product) {
            print("$i ")
        }
    }
}
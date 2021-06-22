package machine

import java.util.*

object CoffeeMachine {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        var mlOfWater: Int
        var mlOfMilk: Int
        var gramsOfCoffee: Int
        var cups: Int
        var money: Int
        val ingredients = intArrayOf(400.also { mlOfWater = it }, 540.also { mlOfMilk = it }, 120.also {
            gramsOfCoffee = it
        }, 9.also { cups = it }, 550.also { money = it })
        choiceAction(ingredients)
    }

    fun choiceAction(ingredients: IntArray) {
        println("Write action (buy, fill, take, remaining, exit): ")
        val scanner = Scanner(System.`in`)
        val action = scanner.next()
        while (action !== "exit") {
            when (action) {
                "buy" -> {
                    buy(ingredients)
                    choiceAction(ingredients)
                }
                "fill" -> {
                    fill(ingredients)
                    choiceAction(ingredients)
                }
                "take" -> {
                    take(ingredients)
                    choiceAction(ingredients)
                }
                "remaining" -> {
                    remaining(ingredients)
                    choiceAction(ingredients)
                }
                "exit" -> System.exit(0)
                else -> {
                    println("Wrong !")
                    choiceAction(ingredients)
                }
            }
        }
    }

    fun remaining(ingredients: IntArray) {
        System.out.printf(
            """
                
                The coffee machine has:
                %d of water
                %d of milk
                %d of coffee beans
                %d of disposable cups
                $%d of money 
                
                
                """.trimIndent(), ingredients[0], ingredients[1], ingredients[2], ingredients[3], ingredients[4]
        )
    }

    fun buy(ingredients: IntArray) {
        val scanner = Scanner(System.`in`)
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
        val coffeeType = scanner.next()
        when (coffeeType) {
            "1" -> espresso(ingredients)
            "2" -> latte(ingredients)
            "3" -> cappuccino(ingredients)
            else -> println("Wrong answer")
        }
    }

    fun espresso(ingredients: IntArray): IntArray {
        val mlOfWaterForEspresso = 250
        val mlOfMilkForEspresso = 0
        val gramsOfCoffeeForEspresso = 16
        val cup = 1
        val price = 4
        if (ingredients[0] >= mlOfWaterForEspresso && ingredients[1] >= mlOfMilkForEspresso && ingredients[2] >= gramsOfCoffeeForEspresso && ingredients[3] >= cup) {
            println("I have enough resources, making you a coffee!")
            ingredients[0] -= mlOfWaterForEspresso
            ingredients[1] -= mlOfMilkForEspresso
            ingredients[2] -= gramsOfCoffeeForEspresso
            ingredients[3] -= cup
            ingredients[4] += price
            return ingredients
        } else if (ingredients[0] < mlOfWaterForEspresso) {
            println("Sorry, not enough water!")
        } else if (ingredients[1] < mlOfMilkForEspresso) {
            println("Sorry, not enough milk!")
        } else if (ingredients[2] < gramsOfCoffeeForEspresso) {
            println("Sorry, not enough coffee!")
        } else if (ingredients[3] < cup) {
            println("Sorry, not enough cups!")
        }
        return ingredients
    }

    fun latte(ingredients: IntArray): IntArray {
        val mlOfWaterForLatte = 350
        val mlOfMilkForLatte = 75
        val gramsOfCoffeeForLatte = 20
        val cup = 1
        val price = 7
        if (ingredients[0] >= mlOfWaterForLatte && ingredients[1] >= mlOfMilkForLatte && ingredients[2] >= gramsOfCoffeeForLatte && ingredients[3] >= cup) {
            println("I have enough resources, making you a coffee!")
            ingredients[0] -= mlOfWaterForLatte
            ingredients[1] -= mlOfMilkForLatte
            ingredients[2] -= gramsOfCoffeeForLatte
            ingredients[3] -= cup
            ingredients[4] += price
            return ingredients
        } else if (ingredients[0] < mlOfWaterForLatte) {
            println("Sorry, not enough water!")
        } else if (ingredients[1] < mlOfMilkForLatte) {
            println("Sorry, not enough milk!")
        } else if (ingredients[2] < gramsOfCoffeeForLatte) {
            println("Sorry, not enough coffee!")
        } else if (ingredients[3] < cup) {
            println("Sorry, not enough cups!")
        }
        return ingredients
    }

    fun cappuccino(ingredients: IntArray): IntArray {
        val mlOfWaterForCappuccino = 200
        val mlOfMilkForCappuccino = 100
        val gramsOfCoffeeForCappuccino = 12
        val cup = 1
        val price = 6
        if (ingredients[0] >= mlOfWaterForCappuccino && ingredients[1] >= mlOfMilkForCappuccino && ingredients[2] >= gramsOfCoffeeForCappuccino && ingredients[3] >= cup) {
            println("I have enough resources, making you a coffee!")
            ingredients[0] -= mlOfWaterForCappuccino
            ingredients[1] -= mlOfMilkForCappuccino
            ingredients[2] -= gramsOfCoffeeForCappuccino
            ingredients[3] -= cup
            ingredients[4] += price
            return ingredients
        } else if (ingredients[0] < mlOfWaterForCappuccino) {
            println("Sorry, not enough water!")
        } else if (ingredients[1] < mlOfMilkForCappuccino) {
            println("Sorry, not enough milk!")
        } else if (ingredients[2] < gramsOfCoffeeForCappuccino) {
            println("Sorry, not enough coffee!")
        } else if (ingredients[3] < cup) {
            println("Sorry, not enough cups!")
        }
        return ingredients
    }

    fun fill(ingredients: IntArray): IntArray {
        val scanner = Scanner(System.`in`)
        println("Write how many ml of water do you want to add: ")
        val mlOfWaterForFill = scanner.nextInt()
        println("Write how many ml of milk do you want to add: ")
        val mlOfMilkForFill = scanner.nextInt()
        println("Write how many grams of coffee beans do you want to add: ")
        val gramsOfCoffeeForFill = scanner.nextInt()
        println("Write how many disposable cups of coffee do you want to add: ")
        val cupsForFill = scanner.nextInt()
        ingredients[0] += mlOfWaterForFill
        ingredients[1] += mlOfMilkForFill
        ingredients[2] += gramsOfCoffeeForFill
        ingredients[3] += cupsForFill
        return ingredients
    }

    fun take(ingredients: IntArray): IntArray {
        System.out.printf("I gave you $%d", ingredients[4])
        ingredients[4] -= ingredients[4]
        return ingredients
    }
}
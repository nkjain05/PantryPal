import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;

public class pantryPal {
    public static final String WELCOME_MESSAGE = "Welcome to PantryPal!\n----------------------------\n";
    public static final String ADD_ITEMS = """
           To add items from your pantry and fridge, simply type the name of each item and press Enter.
           You can enter one item at a time or separate multiple items with commas.
           Type 'done' when you have finished adding items.""";



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // scanner variable

        System.out.println(WELCOME_MESSAGE + ADD_ITEMS);
        String input = " ";
        ArrayList<String> pantryItems = new ArrayList<>();


        do {
            System.out.print("Add an item (or 'done' to finish): ");
            input = scanner.nextLine().toLowerCase();

            // Process the input (e.g., add it to a list of items)
            if (!input.equalsIgnoreCase("done")) {
                // Add the item to the list
                pantryItems.add(input);
                // Process the item here (e.g., store it in a data structure)
                System.out.println("Added: " + input);
            }
        } while (!input.equalsIgnoreCase("done"));

        System.out.println("Your items have been added:");
        System.out.println(pantryItems);

        // Find matching recipes
        List<String> matchingRecipes = findMatchingRecipes(pantryItems);

        System.out.println("Here are some recipe options available:");
        for (String recipe : matchingRecipes) {
            System.out.println(recipe);
        }

        System.out.println("Among the dishes mentioned, which one are you interested in learning how to prepare?");
        String dish = scanner.nextLine();

        switch (dish) {
            case "Spaghetti Aglio e Olio":
                System.out.println("Boil the Pasta: In a large pot, bring water to a boil. Add a pinch of salt and cook the pasta according to the package instructions until it's al dente. Drain and set aside.\n" +
                        "\n" +
                        "Prepare the Sauce: While the pasta is cooking, you can prepare the sauce. In a pan, heat a generous amount of olive oil over medium heat.\n" +
                        "\n" +
                        "Sauté the Garlic: Add minced garlic to the hot olive oil and sauté it until it turns golden brown and fragrant. Be careful not to burn it.\n" +
                        "\n" +
                        "Add Onion: Add finely chopped onion to the pan and continue to sauté until the onion becomes soft and translucent.\n" +
                        "\n" +
                        "Tomato Addition: Dice the tomato and add it to the pan. Cook for a few minutes until the tomato softens and releases its juices.\n" +
                        "\n" +
                        "Combine with Pasta: Add the cooked pasta to the pan with the sauce. Toss everything together, allowing the pasta to soak up the flavors of the sauce.\n" +
                        "\n" +
                        "Season to Taste: Season with salt and pepper to taste. You can also sprinkle some chopped fresh basil or parsley for added flavor.\n" +
                        "\n" +
                        "Serve: Plate your Spaghetti Aglio e Olio and drizzle a bit more olive oil on top. Garnish with grated Parmesan cheese if desired.\n" +
                        "\n" +
                        "Enjoy: Your homemade Spaghetti Aglio e Olio is ready to be enjoyed! Serve it hot and savor the delicious combination of garlic, olive oil, and fresh tomato with perfectly cooked pasta.\n" +
                        "\n" +
                        "Bon appétit!");
                break;
            case "Tomato Basil Pasta":
                System.out.println("Instructions:\n" +
                        "\n" +
                        "Boil the Pasta:\n" +
                        "\n" +
                        "In a large pot, bring water to a boil. Add a pinch of salt and cook the pasta according to the package instructions until it's al dente. Drain and set aside.\n" +
                        "Prepare the Tomato and Basil:\n" +
                        "\n" +
                        "While the pasta is cooking, dice the tomato into small pieces.\n" +
                        "Wash and chop the fresh basil leaves.\n" +
                        "Combine Tomato and Basil:\n" +
                        "\n" +
                        "In a large bowl, combine the diced tomato and chopped basil.\n" +
                        "Add Cooked Pasta:\n" +
                        "\n" +
                        "Add the cooked pasta to the bowl with the tomato and basil.\n" +
                        "Drizzle with Olive Oil (Optional):\n" +
                        "\n" +
                        "If you have olive oil on hand and want to enhance the flavor, you can drizzle a small amount of olive oil over the pasta. This step is optional.\n" +
                        "Season to Taste:\n" +
                        "\n" +
                        "Season with salt and pepper to taste. Be sure to taste and adjust the seasoning as needed.\n" +
                        "Toss and Serve:\n" +
                        "\n" +
                        "Gently toss everything together, ensuring that the pasta is well coated with the tomato and basil.\n" +
                        "Garnish and Serve:\n" +
                        "\n" +
                        "Garnish your Tomato Basil Pasta with additional fresh basil leaves.\n" +
                        "Enjoy:\n" +
                        "\n" +
                        "Your simple and delicious Tomato Basil Pasta is ready to be enjoyed! Serve it hot and savor the wonderful combination of fresh tomatoes and fragrant basil with perfectly cooked pasta.");
                break;
            case "Chicken Stir-Fry":
                System.out.println("Instructions:\n" +
                        "\n" +
                        "Cook the Rice:\n" +
                        "\n" +
                        "Start by cooking the rice according to the package instructions. Set it aside when done.\n" +
                        "Prepare the Chicken:\n" +
                        "\n" +
                        "In a large pan or wok, heat a tablespoon of olive oil over medium-high heat.\n" +
                        "Add the minced garlic and sauté for about 30 seconds until fragrant.\n" +
                        "Cook the Chicken:\n" +
                        "\n" +
                        "Add the chicken pieces to the pan and stir-fry until they are cooked through and no longer pink in the center. This should take about 5-7 minutes.\n" +
                        "Add Broccoli:\n" +
                        "\n" +
                        "Add the broccoli florets to the pan with the cooked chicken. Stir-fry for an additional 3-5 minutes until the broccoli is tender and bright green.\n" +
                        "Soy Sauce and Seasoning:\n" +
                        "\n" +
                        "Pour soy sauce over the chicken and broccoli. Start with a couple of tablespoons and adjust to your taste. Stir to coat the ingredients evenly.\n" +
                        "Combine with Rice:\n" +
                        "\n" +
                        "Add the cooked rice to the pan and stir everything together. Ensure the rice is well coated with the soy sauce and mixed with the chicken and broccoli.\n" +
                        "Taste and Adjust:\n" +
                        "\n" +
                        "Taste the stir-fry and adjust the seasoning by adding more soy sauce if needed. You can also add salt and pepper to taste.\n" +
                        "Serve:\n" +
                        "\n" +
                        "Once everything is well heated and combined, remove the pan from the heat.\n" +
                        "Enjoy:\n" +
                        "\n" +
                        "Your simple and delicious Chicken Stir-Fry with Rice is ready to be enjoyed! Serve it hot and savor the savory flavors of the chicken, broccoli, and garlic.");
                break;
            case "Vegetable Omelette":
                System.out.println("Instructions:\n" +
                        "\n" +
                        "Prepare the Vegetables:\n" +
                        "\n" +
                        "Dice the bell pepper and onion into small, even-sized pieces.\n" +
                        "Whisk the Eggs:\n" +
                        "\n" +
                        "In a bowl, crack and whisk the eggs. You can use as many eggs as needed, depending on how many servings you want. A typical omelette uses 2-3 eggs per serving.\n" +
                        "Add a splash of milk (about 1-2 tablespoons per egg) to the eggs and whisk until well combined. This helps make the omelette fluffy.\n" +
                        "Heat the Pan:\n" +
                        "\n" +
                        "Heat a non-stick skillet or frying pan over medium heat. Add a small amount of butter or cooking oil and let it melt and coat the bottom of the pan.\n" +
                        "Sauté Vegetables:\n" +
                        "\n" +
                        "Add the diced bell pepper and onion to the pan. Sauté them for a few minutes until they become soft and slightly caramelized. Remove them from the pan and set them aside.\n" +
                        "Cook the Omelette:\n" +
                        "\n" +
                        "Pour the beaten egg mixture into the pan. Swirl the eggs around to ensure they cover the bottom evenly.\n" +
                        "Add Cheese and Vegetables:\n" +
                        "\n" +
                        "While the eggs are still slightly runny on top, sprinkle shredded cheese evenly over one half of the omelette.\n" +
                        "Add the sautéed bell pepper and onion on top of the cheese.\n" +
                        "Fold the Omelette:\n" +
                        "\n" +
                        "Carefully lift the other half of the omelette with a spatula and fold it over the side with the cheese and vegetables, creating a half-moon shape.\n" +
                        "Finish Cooking:\n" +
                        "\n" +
                        "Continue to cook for another minute or two until the omelette is fully set, but not browned. You can cover the pan with a lid to help the cheese melt.\n" +
                        "Season and Serve:\n" +
                        "\n" +
                        "Season the omelette with a pinch of salt and pepper to taste.\n" +
                        "Slide the omelette onto a plate, folding it in half if necessary.\n" +
                        "Garnish with some additional shredded cheese and chopped fresh herbs if desired.\n" +
                        "Enjoy:\n" +
                        "\n" +
                        "Your homemade Vegetable Omelette is ready to be enjoyed! Serve it hot, and savor the combination of fluffy eggs, melted cheese, and the sweetness of bell pepper and onion.");
                        break;
            case "Garden Salad":
                System.out.println("Instructions:\n" +
                        "\n" +
                        "Wash and Prepare Vegetables:\n" +
                        "\n" +
                        "Rinse the lettuce leaves thoroughly under cold water and pat them dry with paper towels. Tear or chop the lettuce into bite-sized pieces and place them in a large salad bowl.\n" +
                        "Dice the tomato into small cubes and add it to the bowl.\n" +
                        "Peel and slice the cucumber into rounds or half-moons and add it to the bowl.\n" +
                        "Dice the bell pepper into small pieces and add it to the bowl.\n" +
                        "Toss the Salad:\n" +
                        "\n" +
                        "Gently toss the vegetables together in the salad bowl to mix them evenly.\n" +
                        "Drizzle with Olive Oil:\n" +
                        "\n" +
                        "Drizzle extra virgin olive oil over the salad. Start with a couple of tablespoons and adjust to your taste. The olive oil will add a lovely richness to the salad.\n" +
                        "Season (Optional):\n" +
                        "\n" +
                        "If desired, season the salad with a pinch of salt and pepper to taste. Remember that the salt can enhance the flavors, but it's optional, especially if you prefer a low-sodium salad.\n" +
                        "Toss Again:\n" +
                        "\n" +
                        "Toss the salad once more to distribute the olive oil and seasonings evenly.\n" +
                        "Serve:\n" +
                        "\n" +
                        "Your simple and delicious Garden Salad is ready to be served!\n" +
                        "Enjoy:\n" +
                        "\n" +
                        "Serve the salad immediately as a side dish or add grilled chicken, shrimp, or your protein of choice for a complete meal. Enjoy the fresh, crisp, and vibrant flavors of this healthy salad!");
                break;

            default:
                System.out.println("Sorry the recipe you have chosen is not in the list above");
                return;

        }
        System.out.println("\nThank you for using PantryPal! Have a great day! :)");

    }
    public static List<String> findMatchingRecipes(List<String> pantryItems) {
        List<String> matchingRecipes = new ArrayList<>();

        // Define some sample recipes and their required ingredients
        List<String> recipe1Ingredients = List.of("tomato", "onion", "garlic", "pasta", "olive oil");
        List<String> recipe2Ingredients = List.of("pasta", "tomato", "basil");
        List<String> recipe3Ingredients = List.of("chicken", "rice", "soy sauce", "broccoli", "garlic");
        List<String> recipe4Ingredients = List.of("eggs", "milk", "cheese", "bell pepper", "onion");
        List<String> recipe5Ingredients = List.of("lettuce", "tomato", "cucumber", "bell pepper", "olive oil");



        // Example recipes
        String recipe1 = "Spaghetti Aglio e Olio";
        String recipe2 = "Tomato Basil Pasta";
        String recipe3 = "Chicken Stir-Fry";
        String recipe4 = "Vegetable Omelette";
        String recipe5 = "Garden Salad";


        // Check if each recipe's ingredients are in the pantry
        if (new HashSet<>(pantryItems).containsAll(recipe1Ingredients)) {
            matchingRecipes.add(recipe1);
        }
        if (new HashSet<>(pantryItems).containsAll(recipe2Ingredients)) {
            matchingRecipes.add(recipe2);
        }
        if (new HashSet<>(pantryItems).containsAll(recipe3Ingredients)) {
            matchingRecipes.add(recipe3);
        }
        if (new HashSet<>(pantryItems).containsAll(recipe4Ingredients)) {
            matchingRecipes.add(recipe4);
        }
        if (new HashSet<>(pantryItems).containsAll(recipe5Ingredients)) {
            matchingRecipes.add(recipe5);
        }

        return matchingRecipes;
    }

}

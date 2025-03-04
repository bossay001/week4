package week4Assignment;

public class Week4 {
   



	public static void main(String[] args) {
     
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        int result = ages[ages.length - 1] - ages[0];
        System.out.println(result);

        int[] ages2 = {5, 12, 30, 21, 7, 19, 40, 15, 99};
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println(result2);

     
        double average = calculateAverage(ages2);
        System.out.println(average);
        
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
       
        
        double averageNameLength = calculateAverageNameLength(names);
        System.out.println(averageNameLength);
       
        String concatenatedNames = concatenateNames(names);
        System.out.println(concatenatedNames);
        
        int last = ages [ages.length -1 ];  // Last element
        System.out.println(last);
        
        int first = ages [0];
        System.out.println(first); // first element
     
        for (int length : nameLengths) {
            System.out.print(length + " ");
            
        }  
        System.out.println();
        
        int sum = 0;
        for (int length : nameLengths) {
            sum += length;
        }
        
        System.out.println(sum); // sum of nameLengths
        	
        String helloResult = repeatWord("Hello" , 3);
        System.out.println(helloResult); // Hello result

        String fullName = getFullName ("Joe", "Bob");
        System.out.println(fullName); // Full name result
        
        boolean resultAgeSum = isSumGreaterThan100(ages);
        System.out.println(resultAgeSum); // Used age array and calculated sum
        
        double[] numbersTen = {11.1 , 22.2, 33.3, 44.4, 55.5};
        double[] numbersEleven = {1.1, 1.2, 1.3, 1.4, 1.5};
        double averageTen= calculateAverage(numbersTen);
        System.out.println(averageTen); // Array of double
        
        boolean resultEleven = isFirstArrayAverageGreater(numbersTen, numbersEleven);
        System.out.println(resultEleven); // Added second array and calculated
        
        System.out.println(willBuyDrink(true, 15.00));  
        System.out.println(willBuyDrink(true, 10.50));  
        System.out.println(willBuyDrink(false, 20.00));  // Drink method
    
        willTravel(1500.75);
        willTravel(1000.50);
        willTravel(800.00); 
     // Write own problem. Check to see if money in bank is greater than 1000.50. 
     // If true, prints out "You can Travel!" and if false, "Save more money, your'e almost there!"
	
	}
        
        
            
           
  
 
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    } 
    public static double calculateAverageNameLength(String[] array) {
        int totalLetters = 0;
        for (String name : array) {
            totalLetters += name.length();
        }
        return (double) totalLetters / array.length;
    }
    public static String concatenateNames(String[] array) {
        StringBuilder result = new StringBuilder();
        for (String name : array) {
            result.append(name).append(" ");
        }
        return result.toString().trim(); 
    }
    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        
        return result.toString();
    }
    
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum1 = 0;
        
        for (int num : numbers) {
            sum1 += num;
        }
        
        return sum1 > 100;
    }
    public static boolean isFirstArrayAverageGreater(double[] numbersTen, double[] numbersEleven) {
        return calculateAverage(numbersTen) > calculateAverage(numbersEleven);
    }
    
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0; 
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }
    
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    public static void willTravel(double moneyInBank) {
        if (moneyInBank > 1000.50) {
            System.out.println("You can travel!");
        } else {
            System.out.println("Save more money, you're almost there!");
        }
    }
    
    
    
    
    
    
    }

//    To access last element of array use : array[array.length - 1]
//	 To access first element of array use : array[0]
   
   
  

    
    

	
	
	



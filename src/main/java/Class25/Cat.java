package Class25;

public class Cat {

    /*
    Create a Cat class create 3 fields a constructor and and printInfo method inside it.
    Create three objects from this class store them inside the Linkedlist and
    call printInfo method using these three objects.
     */

        String catName;
        String catBreed;
        int catAge;

        public Cat(String catName, String catBreed, int catAge) {
            this.catName = catName;
            this.catBreed = catBreed;
            this.catAge = catAge;
        }

        void printInfo() {
            System.out.println("Name: "+catName + " Breed: " + catBreed + " Age: " + catAge);
        }
    }


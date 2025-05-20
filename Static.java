public class Static {
    
        String name;
    
        Static(String name) {
            this.name = name;
        }
    
        void eat() {
            System.out.println(name + " is eating.");
        }
    }
    
    class Dog extends Static {
        String breed;
    
        Dog(String name, String breed) {
            super(name); // Calling superclass constructor
            this.breed = breed;
        }
    
        void eat() {
            super.eat(); // Calling superclass method
            System.out.println(name + " is eating like a dog.");
        }
    
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Breed: " + breed);
        }
    
        public static void main(String[] args) {
            Dog myDog = new Dog("Buddy", "Golden Retriever");
            myDog.display();
            myDog.eat();
        }
    }


package school.lesson10;

public class Fruit {
    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }


    class Apple extends Fruit {
        public Apple() {
            super(1.0f);
        }
    }

    class Orange extends Fruit {
        public Orange() {
            super(1.5f);
        }
    }

    class Box<T extends Fruit> {
        private class List<T> fruits;

        public Box() {
            this.fruits = new ArrayList<>();
        }

        public void addFruit(T fruit) {
            fruits.add(fruit);
        }

        public float getWeight() {
            float totalweight = 0.0f;
            for (T fruit : fruits) {
                totalweight += fruit.getWeight();
            }
            return totalweight;
        }
        public boolean compare(Box<?> otherBox){
            return Math.abs(this.getWeight()-otherBox.getWeight()) < 0.0001;
        }
        public void transfer(Box<?> otherBox){
            for (T fruit : fruits) {
                otherBox.addFruit(fruit);
            }
            fruits.clear();
        }

    }
}


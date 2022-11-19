package less_6_OOP;

public class Cat {
        String name;
        String color;
        int age;
        int id;

        @Override
        public String toString() {
                String output = String.format("Кличка - %s, Цвет - %s, Возраст - %d, id-%d", name, color, age, id);
                return output;

        }

        @Override
        public boolean equals(Object newCat) {
                Cat eq = (Cat) newCat;
               return name == eq.name && id == eq.id;
        }

        @Override
        public int hashCode() {
                return id;
        }
}

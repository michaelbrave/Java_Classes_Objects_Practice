package com.tts;

public class Pet {
        // - name (PRIVATE)
        private String name;
		// - age (PRIVATE)
        private int age;
		// - location (PRIVATE)
        private String location;
		// - type (PRIVATE)
        private String type;

        // - constructor 1 //- empty
        public Pet() {
        }
        // - constructor 2 // - all attributes
        public Pet(String name, int age, String location, String type) {
            this.name = name;
            this.age = age;
            this.location = location;
            this.type = type;
        }

        // Code to be able to access the following (Get Methods):
            // - name
            // - age
            // - type
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getType() {
            return type;
        }

        // Code to be able to change (Set Methods):
            // - name
            // - age
            // - location
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setLocation(String location) {
            this.location = location;
        }
}

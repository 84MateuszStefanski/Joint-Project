package sda.interfaces.zadanie3;

public class Car {

    private String name;
    private String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        Engine engine = new Car.Engine();
        engine.setEngine(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    class Engine {
        private String engineType;

        public void setEngine(String carType) {
            switch (carType) {
                case "economy":
                    engineType = "diesel";
                    break;
                case "luxury":
                    engineType = "electric";
                    break;
                default:
                    engineType = "petrol";
            }
        }

        public String getEngineType() {
            return engineType;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

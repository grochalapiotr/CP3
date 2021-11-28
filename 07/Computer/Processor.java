class Processor{
        public String brand;
        public String model;
        public String socket;
        public String frequency;
        public int noOfCores;
        
        
        public Processor(String brand, String model, String socket, String frequency, int noOfCores){
        this.brand=brand;
        this.model=model;
        this.socket=socket;
        this.frequency=frequency;
        this.noOfCores=noOfCores;
        }
        public void calculate(){
            System.out.println("Calculating...");
        }
        public String displaySpecification(){
            return "Brand: "+brand+"\nModel: "+model+"\nSocket: "+socket+"\nFrequency: "+frequency+"\nCores: "+noOfCores;
        }
    }
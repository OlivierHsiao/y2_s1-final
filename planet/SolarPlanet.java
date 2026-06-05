package planet;

public enum SolarPlanet implements planet {
    Earth("Earth", 1.0, "Blue", 1.0),
    Venus("Venus", 0.72, "Yellow", 0.62),
    Neptune("Neptune", 30.07, "Blue", 164.79),
    Jupiter("Jupiter", 5.20, "Orange", 11.86),
    Saturn("Saturn", 9.54, "Beige", 29.46),
    Uranus("Uranus", 19.19, "Cyan", 84.01),
    Mercury("Mercury", 0.39, "Grey", 0.24),
    Mars("Mars", 1.52, "Red", 1.88);

    private String Name;
    private double DistToSun;
    private String Colour;
    private double OrbitPeriod;

    // constructor has to be private
    private SolarPlanet(String Name, double Au, String Colour, double Orbitperiod) {
        this.Name = Name;
        this.DistToSun = Au;
        this.Colour = Colour;
        this.OrbitPeriod = Orbitperiod;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getColour() {
        return Colour;
    }

    // @Override
    public double getPost() {
        return DistToSun;
    }

    @Override
    public double distTo(planet other) {
        if (!SolarPlanet.class.isInstance(other)) {
            throw new NotInSameGalaxy();
        } else {
            return Math.abs(DistToSun - other.getPost());
        }
    }
}
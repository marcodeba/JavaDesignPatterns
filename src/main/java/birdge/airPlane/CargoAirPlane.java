package birdge.airPlane;

import birdge.airPlanMaker.AirPlaneMaker;

/**
 * Created by marcopan on 17/10/28.
 */
public class CargoAirPlane extends AirPlane {
    public CargoAirPlane(AirPlaneMaker airPlaneMaker) {
        super(airPlaneMaker);
    }

    @Override
    public void fly() {
        super.airPlaneMaker.produce();
        System.out.println("CargoAirPlane fly");
    }
}

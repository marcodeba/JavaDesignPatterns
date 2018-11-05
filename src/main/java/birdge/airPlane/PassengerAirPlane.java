package birdge.airPlane;

import birdge.airPlanMaker.AirPlaneMaker;

/**
 * Created by marcopan on 17/10/28.
 */
public class PassengerAirPlane extends AirPlane {
    public PassengerAirPlane(AirPlaneMaker airPlaneMaker) {
        super(airPlaneMaker);
    }

    @Override
    public void fly() {
        super.airPlaneMaker.produce();
        System.out.println("PassengerAirPlane fly");
    }
}

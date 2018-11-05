package birdge;

import birdge.airPlanMaker.AirPlaneMaker;
import birdge.airPlanMaker.Boeing;
import birdge.airPlane.AirPlane;
import birdge.airPlane.PassengerAirPlane;

/**
 * Created by marcopan on 17/10/28.
 */
public class Client {
    public static void main(String[] args) {
        AirPlaneMaker planeMaker = new Boeing();
        AirPlane airPlane = new PassengerAirPlane(planeMaker);
        airPlane.fly();
    }
}

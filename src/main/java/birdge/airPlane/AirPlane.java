package birdge.airPlane;

import birdge.airPlanMaker.AirPlaneMaker;

/**
 * Created by marcopan on 17/10/28.
 */
public abstract class AirPlane {
    AirPlaneMaker airPlaneMaker;

    public AirPlane(AirPlaneMaker airPlaneMaker) {
        this.airPlaneMaker = airPlaneMaker;
    }

    public abstract void fly();
}

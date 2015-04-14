package main;

import main.states.*;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Rafał Zawadzki
 */
public class KwotaDataStateMachine {
    private State stateA;
    private State stateB;
    private State stateC;
    private State stateD;
    private State stateE;
    private State stateF;
    private State stateG;
    private State stateH;
    private State stateI;
    private State stateJ;
    private State stateK;
    private State stateL;
    private State stateM;
    private State stateN;
    private State stateO;
    private State stateP;
    private State stateQ;
    private State stateR;
    private State stateS;
    private State stateT;
    private State stateU;
    private State stateW;
    private State stateX;
    private State stateY;
    private State stateZ;
    private State stateAA;
    private State stateAB;
    private State stateAC;
    private State stateAD;

    private State currentState = stateA;
    public Boolean isAccordance = false;
    public Boolean isCompleted = false;
    public String token = null;

    public KwotaDataStateMachine() {
        stateA = new StateA(this);
        stateB = new StateB(this);
        stateC = new StateC(this);
        stateD = new StateD(this);
        stateE = new StateE(this);
        stateF = new StateF(this);
        stateG = new StateG(this);
        stateH = new StateH(this);
        stateI = new StateI(this);
        stateJ = new StateJ(this);
        stateK = new StateK(this);
        stateL = new StateL(this);
        stateM = new StateM(this);
        stateN = new StateN(this);
        stateO = new StateO(this);
        stateP = new StateP(this);
        stateQ = new StateQ(this);
        stateR = new StateR(this);
        stateS = new StateS(this);
        stateT = new StateT(this);
        stateU = new StateU(this);
        stateW = new StateW(this);
        stateX = new StateX(this);
        stateY = new StateY(this);
        stateZ = new StateZ(this);
        stateAA = new StateAA(this);
        stateAB = new StateAB(this);
        stateAC = new StateAC(this);
        stateAD = new StateAD(this);

    }

    public void retriveState(Character s) {
        s = normalizeNumberState(s);
        currentState.goBySymbol(s);
    }

    private Character normalizeNumberState(Character s) {
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(s.toString());
        if (m.matches()) {
            s = '1';
        }
        return s;
    }

    public void resetMachine() {
        isAccordance = false;
        currentState = stateA;
        token = null;
        isCompleted = false;
    }

    public void setState(State s) {
        if(!s.isAcceptable()) {
            isAccordance = false;
        }
        currentState = s;
        isAccordance = true;
    }

    public State getStateA() {
        return stateA;
    }

    public State getStateB() {
        return stateB;
    }

    public State getStateC() {
        return stateC;
    }

    public State getStateD() {
        return stateD;
    }

    public State getStateE() {
        return stateE;
    }

    public State getStateF() {
        return stateF;
    }

    public State getStateG() {
        return stateG;
    }

    public State getStateH() {
        return stateH;
    }

    public State getStateI() {
        return stateI;
    }

    public State getStateJ() {
        return stateJ;
    }

    public State getStateK() {
        return stateK;
    }

    public State getStateL() {
        return stateL;
    }

    public State getStateM() {
        return stateM;
    }

    public State getStateN() {
        return stateN;
    }

    public State getStateO() {
        return stateO;
    }

    public State getStateP() {
        return stateP;
    }

    public State getStateQ() {
        return stateQ;
    }

    public State getStateR() {
        return stateR;
    }

    public State getStateS() {
        return stateS;
    }

    public State getStateT() {
        return stateT;
    }

    public State getStateU() {
        return stateU;
    }

    public State getStateW() {
        return stateW;
    }

    public State getStateX() {
        return stateX;
    }

    public State getStateY() {
        return stateY;
    }

    public State getStateZ() {
        return stateZ;
    }

    public State getStateAA() {
        return stateAA;
    }

    public State getStateAB() {
        return stateAB;
    }

    public State getStateAC() {
        return stateAC;
    }

    public State getStateAD() {
        return stateAD;
    }

    public State getCurrentState() {
        return currentState;
    }


}

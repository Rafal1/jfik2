package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateAB implements State {
    KwotaDataStateMachine kdsm;

    public StateAB(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case '-':
            case '/':
                kdsm.setState(kdsm.getStateAC());
                break;
            default:
                kdsm.resetMachine();
        }
    }

    @Override
    public Boolean isAcceptable() {
        return false;
    }
}

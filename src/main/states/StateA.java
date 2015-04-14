package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateA implements State {
    KwotaDataStateMachine kdsm;

    public StateA(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public Boolean isAcceptable() {
        return false;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case '1':
                kdsm.setState(kdsm.getStateB());
                break;
            default:
                kdsm.resetMachine();
        }
    }

}

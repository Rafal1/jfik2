package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateR implements State {
    KwotaDataStateMachine kdsm;

    public StateR(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case '1':
                kdsm.setState(kdsm.getStateS());
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

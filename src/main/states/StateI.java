package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateI implements State {
    KwotaDataStateMachine kdsm;

    public StateI(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case 'ś':
                kdsm.setState(kdsm.getStateJ());
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

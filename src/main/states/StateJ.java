package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateJ implements State {
    KwotaDataStateMachine kdsm;

    public StateJ(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
    }

    @Override
    public Boolean isAcceptable() {
        kdsm.isCompleted = true;
        kdsm.token = "<KWOTA>";
        return true;
    }
}

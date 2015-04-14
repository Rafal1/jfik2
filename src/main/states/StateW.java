package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateW implements State {
    KwotaDataStateMachine kdsm;

    public StateW(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
    }

    @Override
    public Boolean isAcceptable() {
        kdsm.isCompleted = true;
        kdsm.token = "<DATA>";
        return true;
    }
}

package com.rotoai.scoop_basics_d2.scoop;

import com.lyft.scoop.RouteChange;
import com.lyft.scoop.Screen;

import io.reactivex.Observable;

public class DialogRouter {

    private final AppRouter dialogRouter;

    public DialogRouter(AppRouter router) {
        this.dialogRouter = router;
    }

    public boolean dismiss() {
        return dialogRouter.goBack();
    }

    public void show(Screen screen) {
        dialogRouter.replaceAllWith(screen);
    }

    public Observable<RouteChange> observeDialogChange() {
        return dialogRouter.observeRouteChange();
    }
}

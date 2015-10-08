package io.ribot.app.injection.component;

import android.accounts.AccountManager;
import android.app.Application;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;
import io.ribot.app.data.DataManager;
import io.ribot.app.injection.module.ApplicationModule;
import io.ribot.app.ui.checkin.CheckInPresenter;
import io.ribot.app.ui.main.MainPresenter;
import io.ribot.app.ui.signin.SignInPresenter;
import rx.subscriptions.CompositeSubscription;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SignInPresenter signInPresenter);
    void inject(MainPresenter mainPresenter);
    void inject(CheckInPresenter checkInPresenter);

    Application application();
    DataManager dataManager();
    Bus eventBus();
    AccountManager accountManager();
    CompositeSubscription compositeSubscription();
}
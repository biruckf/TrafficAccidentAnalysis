import {BrowserModule, Title} from "@angular/platform-browser";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {NgModule} from "@angular/core";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {ResponsiveModule} from "ng2-responsive";
import {AppComponent} from "./app.component";
import {AppState, InternalStateType} from "./app.service";
import {GlobalState} from "./app.state";
import {ServicesModule} from "./shared/services/services.module";
import {SharedModule} from "./shared/shared.module";
import {AppRoutingModule} from "./app.routing";
import {LocalStorageTodoService} from "./shared/services/localstorage/localstorage-todo.service";
import {HttpClientModule} from "@angular/common/http";
import { UserComponent } from './user/user.component';
import { UserListComponent } from './user-list/user-list.component';
import { SuperListComponent } from './super-list/super-list.component';
import { AdminComponent } from './pages/forms/admin/admin.component';
import { AdminListComponent } from './admin-list/admin-list.component';
import { SuperUserComponent } from './super-user/super-user.component';
import { AccidentFormComponent } from './pages/accident-form/accident-form.component';

//import { InMemoryTodoService } from "./shared/services/inMemory/in-memory-todo.service";
// Application wide providers
const APP_PROVIDERS = [AppState, GlobalState, Title, LocalStorageTodoService];

export type StoreType = {
    state: InternalStateType;
    restoreInputValues: () => void;
    disposeOldHosts: () => void;
};

@NgModule({
    declarations: [AppComponent, UserComponent, UserListComponent, SuperListComponent, AdminComponent, AdminListComponent, SuperUserComponent, AccidentFormComponent],
    imports: [
        BrowserModule,
        FormsModule,
        HttpClientModule,
        ReactiveFormsModule,
        BrowserAnimationsModule,
        ServicesModule,
        ResponsiveModule,
        SharedModule.forRoot(),
        AppRoutingModule
    ],
    providers: [APP_PROVIDERS],
    bootstrap: [AppComponent]
})
export class AppModule {
    constructor(public appState: AppState) {
    }
}

// Angular
// https://angular.io/
import {ModuleWithProviders, NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
// Angular Material
// https://material.angular.io/
import {
    MatAutocompleteModule,
    MatButtonModule,
    MatButtonToggleModule,
    MatCardModule,
    MatCheckboxModule,
    MatChipsModule,
    MatDatepickerModule,
    MatDialogModule,
    MatExpansionModule,
    MatGridListModule,
    MatIconModule,
    MatInputModule,
    MatListModule,
    MatMenuModule,
    MatNativeDateModule,
    MatProgressBarModule,
    MatProgressSpinnerModule,
    MatRadioModule,
    MatRippleModule,
    MatSelectModule,
    MatSidenavModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatSnackBarModule,
    MatTabsModule,
    MatToolbarModule,
    MatTooltipModule,
		MatStepperModule,
} from "@angular/material";
import {MalihuScrollbarModule} from "ngx-malihu-scrollbar";
// ngx-bootstrap4
// http://valor-software.com/ngx-bootstrap/index-bs4.html#/
import {TabsModule} from "ngx-bootstrap/tabs";
import {BsDropdownModule} from "ngx-bootstrap/dropdown";
import {AlertModule} from "ngx-bootstrap/alert";
import {ModalModule} from "ngx-bootstrap/modal";
import {PopoverModule} from "ngx-bootstrap/popover";
// angular2-moment
// https://github.com/urish/angular2-moment
import {MomentModule} from "angular2-moment";
// ng-chartist
// https://github.com/willsoto/ng-chartist
import {ChartistModule} from "ng-chartist";
// Demos of ng-chartist
import {ChartistBarsComponent} from "./components/charts/chartist/chartist-bars/chartist-bars.component";
import {ChartistLineComponent} from "./components/charts/chartist/chartist-line/chartist-line.component";
import {ChartistLinesComponent} from "./components/charts/chartist/chartist-lines/chartist-lines.component";
// ng2-charts
// http://valor-software.com/ng2-charts/
import {ChartsModule} from "ng2-charts";
// Demos of ng2-charts
import {ng2LineChartDemoComponent} from "./components/charts/ng2-charts/ng2-charts-line.component";
import {ng2BarChartDemoComponent} from "./components/charts/ng2-charts/ng2-charts-bar.component";
import {ng2DoughnutChartDemoComponent} from "./components/charts/ng2-charts/ng2-charts-doughnut.component";
import {ng2RadarChartDemoComponent} from "./components/charts/ng2-charts/ng2-charts-radar.component";
import {ng2PieChartDemoComponent} from "./components/charts/ng2-charts/ng2-charts-pie.component";
import {ng2PolarChartDemoComponent} from "./components/charts/ng2-charts/ng2-charts-polar.component";
// ngx-charts
// https://github.com/swimlane/ngx-charts
import {NgxChartsModule} from "@swimlane/ngx-charts";
//Demos of // ngx-charts
import {NgxChartsBarVerticalDemoComponent} from "./components/charts/ngx-charts/ngx-vertical-bar-chart.component";
import {NgxChartsBarHorizontalDemoComponent} from "./components/charts/ngx-charts/ngx-horizontal-bar-chart.component";
import {NgxPieChartsDemoComponent} from "./components/charts/ngx-charts/ngx-pie-chart.component";
import {NgxPieGridChartsDemoComponent} from "./components/charts/ngx-charts/ngx-pie-grid-chart.component";
import {NgxLineChartsDemoComponent} from "./components/charts/ngx-charts/ngx-line-chart.component";
import {NgxAreaChartsDemoComponent} from "./components/charts/ngx-charts/ngx-area-chart.component";
// angular-gauge
// https://github.com/mattlewis92/angular-gauge
import { GaugeModule } from 'angular-gauge';
import {
	GaugeComponent
} from "./components/charts/ng-gauge/ng-gauge.component";
// UI Shared Components
import {FooterComponent} from "../layout/footer/footer.component";
import {AppBackdropComponent} from "./components/app_backdrop/app_backdrop.component";
import {StackedCardsComponent} from "./components/cards/stacked-cards/stacked-cards.component";
import {MailCardComponent} from "./components/cards/mail-card/mail-card.component";
import {ScrumCardComponent} from "./components/cards/scrum-card/scrum-card.component";
import {SocialCardComponent} from "./components/cards/social-card/social-card.component";
import {ImageOverCardComponent} from "./components/cards/image-over-card/image-over-card.component";
import {ImageCardComponent} from "./components/cards/image-card/image-card.component";
import {TabsOverCardComponent} from "./components/cards/tabs-over-card/tabs-over-card.component";
import {ScheduleCardComponent} from "./components/cards/schedule-card/schedule-card.component";
import {GalleryCardComponent} from "./components/cards/gallery-card/gallery-card.component";
import {ListCardComponent} from "./components/cards/list-card/list-card.component";
import {WeatherCardComponent} from "./components/cards/weather-card/weather-card.component";
import {TodoComponent} from "./components/todo/todo.component";
import {TaskComponent} from "./components/todo/task.component";
//wizard
//Form Validation
// https://github.com/yuyang041060120/ng2-validation
import {CustomFormsModule} from "ng2-validation";

//Drag and drop
import {DndModule} from "ng2-dnd";
import {
    SmdFabSpeedDialActionsComponent,
    SmdFabSpeedDialComponent,
    SmdFabSpeedDialTriggerComponent
} from "./components/fab";



@NgModule({
    imports: [
        CommonModule,
        FormsModule,
        ReactiveFormsModule,
        MomentModule,
        MatAutocompleteModule,
        MatButtonModule,
        MatButtonToggleModule,
        MatCardModule,
        MatCheckboxModule,
        MatChipsModule,
        MatDatepickerModule,
        MatDialogModule,
        MatExpansionModule,
        MatGridListModule,
        MatIconModule,
        MatInputModule,
        MatListModule,
        MatMenuModule,
        MatNativeDateModule,
        MatProgressBarModule,
        MatProgressSpinnerModule,
        MatRadioModule,
        MatRippleModule,
        MatSelectModule,
        MatSidenavModule,
        MatSliderModule,
        MatSlideToggleModule,
        MatSnackBarModule,
        MatTabsModule,
			  MatStepperModule,
        MatToolbarModule,
        MatTooltipModule,
        ChartistModule,
        ChartsModule,
        NgxChartsModule,
        CustomFormsModule,
				GaugeModule.forRoot(),
        BsDropdownModule.forRoot(),
        AlertModule.forRoot(),
        TabsModule.forRoot(),
        MalihuScrollbarModule.forRoot(),
        ModalModule.forRoot(),
        PopoverModule.forRoot(),
        DndModule.forRoot()
    ],
    declarations: [
        AppBackdropComponent,
        FooterComponent,
        MailCardComponent,
        StackedCardsComponent,
        ScrumCardComponent,
        SocialCardComponent,
        TabsOverCardComponent,
        ScheduleCardComponent,
        GalleryCardComponent,
        ListCardComponent,
        WeatherCardComponent,
        TodoComponent,
        TaskComponent,
        ImageOverCardComponent,
        ImageCardComponent,
        ChartistBarsComponent,
        ChartistLineComponent,
        ChartistLinesComponent,
        ng2LineChartDemoComponent,
        ng2BarChartDemoComponent,
        ng2DoughnutChartDemoComponent,
        ng2RadarChartDemoComponent,
        ng2PieChartDemoComponent,
        ng2PolarChartDemoComponent,
        NgxChartsBarVerticalDemoComponent,
        NgxChartsBarHorizontalDemoComponent,
        NgxPieChartsDemoComponent,
        NgxPieGridChartsDemoComponent,
        NgxLineChartsDemoComponent,
        NgxAreaChartsDemoComponent,
        GaugeComponent,
        SmdFabSpeedDialActionsComponent,
        SmdFabSpeedDialComponent,
        SmdFabSpeedDialTriggerComponent
    ],
    exports: [
        CommonModule,
        FormsModule,
        MomentModule,
        MatAutocompleteModule,
        MatButtonModule,
        MatButtonToggleModule,
        MatCardModule,
        MatCheckboxModule,
        MatChipsModule,
        MatDatepickerModule,
        MatDialogModule,
        MatExpansionModule,
        MatGridListModule,
        MatIconModule,
        MatInputModule,
        MatListModule,
        MatMenuModule,
        MatNativeDateModule,
        MatProgressBarModule,
        MatProgressSpinnerModule,
        MatRadioModule,
        MatRippleModule,
        MatSelectModule,
        MatSidenavModule,
        MatSliderModule,
        MatSlideToggleModule,
        MatSnackBarModule,
        MatTabsModule,
				MatStepperModule,
        MatToolbarModule,
        MatTooltipModule,
        AppBackdropComponent,
        ChartistBarsComponent,
        ChartistLineComponent,
        ChartistLinesComponent,
        ng2LineChartDemoComponent,
        ng2BarChartDemoComponent,
        ng2DoughnutChartDemoComponent,
        ng2RadarChartDemoComponent,
        ng2PieChartDemoComponent,
        ng2PolarChartDemoComponent,
        NgxChartsBarVerticalDemoComponent,
        NgxChartsBarHorizontalDemoComponent,
        NgxPieChartsDemoComponent,
        NgxPieGridChartsDemoComponent,
        NgxLineChartsDemoComponent,
        NgxAreaChartsDemoComponent,
        FooterComponent,
        MailCardComponent,
        StackedCardsComponent,
        ScrumCardComponent,
        SocialCardComponent,
        TabsOverCardComponent,
        ScheduleCardComponent,
        GalleryCardComponent,
        ListCardComponent,
        WeatherCardComponent,
        TodoComponent,
        TaskComponent,
        ImageOverCardComponent,
        ImageCardComponent,
        ReactiveFormsModule,
        TabsModule,
        BsDropdownModule,
        AlertModule,
        MalihuScrollbarModule,
        ModalModule,
        PopoverModule,
				GaugeModule,
				GaugeComponent,
        ChartsModule,
        NgxChartsModule,
        CustomFormsModule,
        SmdFabSpeedDialActionsComponent,
        SmdFabSpeedDialComponent,
        SmdFabSpeedDialTriggerComponent
    ]
})
export class SharedModule {
    static forRoot(): ModuleWithProviders {
        return {
            ngModule: SharedModule
        };
    }
}

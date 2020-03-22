import {Component, Input, ViewChild} from "@angular/core";
import {FormControl, NgModel} from "@angular/forms";
import "rxjs/add/operator/startWith";
import "rxjs/add/operator/map";

@Component({
    selector: ".content_inner_wrapper",
    templateUrl: "./form-comp.component.html",
    styleUrls: ["./form-comp.component.scss"]
})
export class FormCompComponent {
    color = "accent";
    checked = false;
    disabled = false;
    value: any;
    @Input() public toolsConfig: any;
    stateCtrl: FormControl;
    currentState = "";
    topHeightCtrl = new FormControl(0);


    //Date Ranger
    options: any;

    //AUTO SUGGEST
    reactiveStates: any;
    tdStates: any[];
    tdDisabled = false;

//Mask
    public myModel: string;
    public modelWithValue: string;
    public formControlInput: FormControl = new FormControl();
    public mask: Array<string | RegExp>;

    @ViewChild(NgModel) modelDir: NgModel;

    states = [
        {code: "AL", name: "Alabama"},
        {code: "AK", name: "Alaska"},
        {code: "AZ", name: "Arizona"},
        {code: "AR", name: "Arkansas"},
        {code: "CA", name: "California"},
        {code: "CO", name: "Colorado"},
        {code: "CT", name: "Connecticut"},
        {code: "DE", name: "Delaware"},
        {code: "FL", name: "Florida"},
        {code: "GA", name: "Georgia"},
        {code: "HI", name: "Hawaii"},
        {code: "ID", name: "Idaho"},
        {code: "IL", name: "Illinois"},
        {code: "IN", name: "Indiana"},
        {code: "IA", name: "Iowa"},
        {code: "KS", name: "Kansas"},
        {code: "KY", name: "Kentucky"},
        {code: "LA", name: "Louisiana"},
        {code: "ME", name: "Maine"},
        {code: "MD", name: "Maryland"},
        {code: "MA", name: "Massachusetts"},
        {code: "MI", name: "Michigan"},
        {code: "MN", name: "Minnesota"},
        {code: "MS", name: "Mississippi"},
        {code: "MO", name: "Missouri"},
        {code: "MT", name: "Montana"},
        {code: "NE", name: "Nebraska"},
        {code: "NV", name: "Nevada"},
        {code: "NH", name: "New Hampshire"},
        {code: "NJ", name: "New Jersey"},
        {code: "NM", name: "New Mexico"},
        {code: "NY", name: "New York"},
        {code: "NC", name: "North Carolina"},
        {code: "ND", name: "North Dakota"},
        {code: "OH", name: "Ohio"},
        {code: "OK", name: "Oklahoma"},
        {code: "OR", name: "Oregon"},
        {code: "PA", name: "Pennsylvania"},
        {code: "RI", name: "Rhode Island"},
        {code: "SC", name: "South Carolina"},
        {code: "SD", name: "South Dakota"},
        {code: "TN", name: "Tennessee"},
        {code: "TX", name: "Texas"},
        {code: "UT", name: "Utah"},
        {code: "VT", name: "Vermont"},
        {code: "VA", name: "Virginia"},
        {code: "WA", name: "Washington"},
        {code: "WV", name: "West Virginia"},
        {code: "WI", name: "Wisconsin"},
        {code: "WY", name: "Wyoming"}
    ];

    constructor() {
        this.tdStates = this.states;
        this.stateCtrl = new FormControl({code: "CA", name: "California"});
        this.reactiveStates = this.stateCtrl.valueChanges
            .startWith(this.stateCtrl.value)
            .map(val => this.displayFn(val))
            .map(name => this.filterStates(name));

        //Mask
        this.mask = ['(', /[1-9]/, /\d/, /\d/, ')', ' ', /\d/, /\d/, /\d/, '-', /\d/, /\d/, /\d/, /\d/]
        this.myModel = ''
        this.modelWithValue = '5554441234'
        this.formControlInput.setValue('5555551234')
    }

    ngOnInit() {
        this.options = {
            theme: "teal",
            range: "tm",
            dayNames: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
            presetNames: [
                "This Month",
                "Last Month",
                "This Week",
                "Last Week",
                "This Year",
                "Last Year",
                "Start",
                "End"
            ],
            dateFormat: "yMd",
            outputFormat: "DD/MM/YYYY",
            startOfWeek: 1
        };
        console.log(this.options);
    }

    displayFn(value: any): string {
        return value && typeof value === "object" ? value.name : value;
    }

    filterStates(val: string) {
        if (val) {
            const filterValue = val.toLowerCase();
            return this.states.filter(state =>
                state.name.toLowerCase().startsWith(filterValue)
            );
        }

        return this.states;
    }
}

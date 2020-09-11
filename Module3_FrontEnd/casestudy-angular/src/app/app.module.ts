import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateContractComponent } from './component/contract/create-contract/create-contract.component';
import { CreateDetailContractComponent } from './component/detail-contract/create-detail-contract/create-detail-contract.component';
import { CreateServiceComponent } from './component/service/create-service/create-service.component';
import { CreateEmployeeComponent } from './component/employee/create-employee/create-employee.component';
import { CreateCustomerComponent } from './component/customer/create-customer/create-customer.component';
import { ListCustomerComponent } from './component/customer/list-customer/list-customer.component';
import { EditCustomerComponent } from './component/customer/edit-customer/edit-customer.component';
import { ListEmployeeComponent } from './component/employee/list-employee/list-employee.component';
import { EditEmployeeComponent } from './component/employee/edit-employee/edit-employee.component';
import { ListServiceComponent } from './component/service/list-service/list-service.component';
import { EditServiceComponent } from './component/service/edit-service/edit-service.component';
import { ListDetailContractComponent } from './component/detail-contract/list-detail-contract/list-detail-contract.component';
import { EditDetailContractComponent } from './component/detail-contract/edit-detail-contract/edit-detail-contract.component';
import { ListContractComponent } from './component/contract/list-contract/list-contract.component';
import { EditContractComponent } from './component/contract/edit-contract/edit-contract.component';
import { HomeComponent } from './component/home/home.component';
import { ListCustomerUseServiceComponent } from './component/customer/list-customer-use-service/list-customer-use-service.component';
import {RouterModule} from "@angular/router";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { HttpClientModule } from '@angular/common/http';

import { NgxPaginationModule } from 'ngx-pagination';

@NgModule({
  declarations: [
    AppComponent,
    CreateContractComponent,
    CreateDetailContractComponent,
    CreateServiceComponent,
    CreateEmployeeComponent,
    CreateCustomerComponent,
    ListCustomerComponent,
    EditCustomerComponent,
    ListEmployeeComponent,
    EditEmployeeComponent,
    ListServiceComponent,
    EditServiceComponent,
    ListDetailContractComponent,
    EditDetailContractComponent,
    ListContractComponent,
    EditContractComponent,
    HomeComponent,
    ListCustomerUseServiceComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        RouterModule,
        ReactiveFormsModule,
        FormsModule,
        NgxPaginationModule,
        HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

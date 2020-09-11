import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AngularHomeComponent } from './angular-home/angular-home.component';
import { AngularListCustomerComponent } from './customer/angular-list-customer/angular-list-customer.component';
import { AngularListEmployeeComponent } from './employee/angular-list-employee/angular-list-employee.component';
import { AngularListContractComponent } from './contract/angular-list-contract/angular-list-contract.component';
import { AngularListDetailContractComponent } from './contract/angular-list-detail-contract/angular-list-detail-contract.component';
import { AngularListCustomerUseServiceComponent } from './customer/angular-list-customer-use-service/angular-list-customer-use-service.component';
import { AngularCreateCustomerComponent } from './customer/angular-create-customer/angular-create-customer.component';
import { AngularCreateEmployeeComponent } from './employee/angular-create-employee/angular-create-employee.component';
import { AngularCreateContractComponent } from './contract/angular-create-contract/angular-create-contract.component';
import { AngularCreateDetailContractComponent } from './contract/angular-create-detail-contract/angular-create-detail-contract.component';
import { AngularCreateServiceComponent } from './service/angular-create-service/angular-create-service.component';
import { AngularListServiceComponent } from './service/angular-list-service/angular-list-service.component';
import { AngularEditCustomerComponent } from './customer/angular-edit-customer/angular-edit-customer.component';
import { AngularEditContractComponent } from './contract/angular-edit-contract/angular-edit-contract.component';
import { AngularEditDetailContractComponent } from './contract/angular-edit-detail-contract/angular-edit-detail-contract.component';
import { AngularEditEmployeeComponent } from './employee/angular-edit-employee/angular-edit-employee.component';
import { AngularEditServiceComponent } from './service/angular-edit-service/angular-edit-service.component';

@NgModule({
  declarations: [
    AppComponent,
    AngularHomeComponent,
    AngularListCustomerComponent,
    AngularListEmployeeComponent,
    AngularListContractComponent,
    AngularListDetailContractComponent,
    AngularListCustomerUseServiceComponent,
    AngularCreateCustomerComponent,
    AngularCreateEmployeeComponent,
    AngularCreateContractComponent,
    AngularCreateDetailContractComponent,
    AngularCreateServiceComponent,
    AngularListServiceComponent,
    AngularEditCustomerComponent,
    AngularEditContractComponent,
    AngularEditDetailContractComponent,
    AngularEditEmployeeComponent,
    AngularEditServiceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

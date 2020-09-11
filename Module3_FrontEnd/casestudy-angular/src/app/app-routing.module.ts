import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./component/home/home.component";
import {ListCustomerComponent} from "./component/customer/list-customer/list-customer.component";
import {CreateCustomerComponent} from "./component/customer/create-customer/create-customer.component";
import {EditCustomerComponent} from "./component/customer/edit-customer/edit-customer.component";
import {ListEmployeeComponent} from "./component/employee/list-employee/list-employee.component";
import {CreateEmployeeComponent} from "./component/employee/create-employee/create-employee.component";
import {EditEmployeeComponent} from "./component/employee/edit-employee/edit-employee.component";
import {ListContractComponent} from "./component/contract/list-contract/list-contract.component";
import {CreateContractComponent} from "./component/contract/create-contract/create-contract.component";
import {EditContractComponent} from "./component/contract/edit-contract/edit-contract.component";
import {CreateDetailContractComponent} from "./component/detail-contract/create-detail-contract/create-detail-contract.component";
import {EditDetailContractComponent} from "./component/detail-contract/edit-detail-contract/edit-detail-contract.component";
import {ListDetailContractComponent} from "./component/detail-contract/list-detail-contract/list-detail-contract.component";
import {ListCustomerUseServiceComponent} from "./component/customer/list-customer-use-service/list-customer-use-service.component";
import {ListServiceComponent} from "./component/service/list-service/list-service.component";
import {CreateServiceComponent} from "./component/service/create-service/create-service.component";
import {EditServiceComponent} from "./component/service/edit-service/edit-service.component";

const routes: Routes = [
  // {path: '', component: HomeComponent, children: [
  //     {path: '', component: HomeComponent},
  //     {path: 'customer', component: ListCustomerComponent},
  //     {path: 'customer/create', component: CreateCustomerComponent},
  //     {path: 'customer/edit/:id', component: EditCustomerComponent},
  //     {path: 'customer/detail/:id', component: DetailCustomerComponent},
  //     {path: 'customer/listUseService', component: ListCustomerUseServiceComponent},
  //     {path: 'employee', component: ListEmployeeComponent},
  //     {path: 'employee/create', component: CreateEmployeeComponent},
  //     {path: 'employee/edit/:id', component: EditEmployeeComponent},
  //     {path: 'employee/detail/:id', component: DetailEmployeeComponent},
  //     {path: 'service', component: ListServiceComponent},
  //     {path: 'service/create', component: CreateServiceComponent},
  //     {path: 'service/edit/:id', component: EditServiceComponent},
  //     {path: 'contract', component: ListContractComponent},
  //     {path: 'contract/create', component: CreateContractComponent},
  //     {path: 'contract/edit/:id', component: EditContractComponent},
  //     {path: 'contract/detail/:id', component: InformationContractComponent},
  //     {path: 'detailContract', component: ListDetailContractComponent},
  //     {path: 'detailContract/create', component: CreateDetailContractComponent},
  //     {path: 'detailContract/edit/:id', component: EditDetailContractComponent}
    // ]
// }
  {path: '', component: HomeComponent, pathMatch:'full'},
  {
    path: 'customer', children: [
      {path: '', component: ListCustomerComponent},
      {path: 'create', component: CreateCustomerComponent},
      {path: 'edit/:id', component: EditCustomerComponent},
      {path: 'listUseService', component: ListCustomerUseServiceComponent}
      ]
  },
  {
    path: 'employee', children: [
      {path: '', component: ListEmployeeComponent},
      {path: 'create', component: CreateEmployeeComponent},
      {path: 'edit/:id', component: EditEmployeeComponent},
    ]
  },
  {
    path: 'service', children: [
      {path: '', component: ListServiceComponent},
      {path: 'create', component: CreateServiceComponent},
      {path: 'edit/:id', component: EditServiceComponent},
    ]
  },
  {
    path: 'contract', children: [
      {path: '', component: ListContractComponent},
      {path: 'create', component: CreateContractComponent},
      {path: 'edit/:id', component: EditContractComponent},
    ]
  },
  {path: 'detailContract', children: [
      {path: '', component: ListDetailContractComponent},
      {path: 'create', component: CreateDetailContractComponent},
      {path: 'edit/:id', component: EditDetailContractComponent},
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

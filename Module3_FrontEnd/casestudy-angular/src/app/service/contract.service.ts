import { Injectable } from '@angular/core';
import {Contract} from "../model/contract";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ContractService {

  // contracts = contractList;
  private readonly CONTRACT_URL = " http://localhost:3000/contractList";

  constructor(private httpClient: HttpClient) {}

  // findAll(): Contract[] {
  //   return this.contracts;
  // }

  getAllContract(): Observable<Contract[]> {
    return this.httpClient.get<Contract[]>(this.CONTRACT_URL);
  }

  getContractById(maHopDong: string): Observable<Contract> {
    return this.httpClient.get<Contract>(`${this.CONTRACT_URL}/${maHopDong}`);
  }

  createContract(contract: Contract): Observable<Contract> {
    return this.httpClient.post<Contract>(this.CONTRACT_URL, contract);
  }

  editContract(contract: Contract, id: number): Observable<void> {
    return this.httpClient.patch<void>(`${this.CONTRACT_URL}/${contract.id}`, contract);
  }

  deleteContract(id: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.CONTRACT_URL}/${id}`);
  }
}

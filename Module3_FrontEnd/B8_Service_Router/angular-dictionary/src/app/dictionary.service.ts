import { Injectable } from '@angular/core';

export interface IWord {
  key: string;
  meaning: string;
}

@Injectable({
  providedIn: 'root'
})

export class DictionaryService {

  private words: IWord[] = [
    {
      key: 'service',
      meaning: 'dich vu'
    },
    {
      key: 'service provider',
      meaning: 'nha cung cap dich vu'
    },
    {
      key: 'provide',
      meaning: 'cung cap'
    },
    {
      key: 'efficient',
      meaning: 'hieu qua'
    },
    {
      key: 'snow',
      meaning: 'tuyet'
    },
  ]

  constructor() { }

  search(word: string): string {
    if (!word) {
      return '';
    }
    const w = this.words.find(item => item.key === word.toLowerCase());
    if (w) {
      return w.meaning;
    }
    return 'Not found';
  }

  getAll(): IWord[] {
    return this.words;
  }
}

export interface Service {
  madichVu: string;
  tenDichVu: string;
  dienTich: string;
  soTang: number;
  soNguoiToiDa: number;
  chiPhiThue: string;
  trangThai: string;
  hinhThucThue: string;
}

export let serviceList =[
  {
    madichVu: 'DV-0001',
    tenDichVu: 'Garden Deluxe King Room',
    dienTich: '50',
    soTang: '1',
    soNguoiToiDa: '2',
    chiPhiThue: '3.000.000',
    trangThai: 'Hết Phòng',
    hinhThucThue: 'Thuê Theo Ngày',
  },
  {
    madichVu: 'DV-0002',
    tenDichVu: 'Ocean House',
    dienTich: '145',
    soTang: '2',
    soNguoiToiDa: '5',
    chiPhiThue: '7.000.000',
    trangThai: 'Còn Phòng',
    hinhThucThue: 'Thuê Theo Ngày',
  },
  {
    madichVu: 'DV-0002',
    tenDichVu: 'Pool Villa',
    dienTich: '300',
    soTang: '3',
    soNguoiToiDa: '7',
    chiPhiThue: '15.000.000',
    trangThai: 'Còn Phòng',
    hinhThucThue: 'Thuê Theo Tuần',
  },
];

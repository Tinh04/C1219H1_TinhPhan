export interface DetailContract {
  maHopDong: string;
  maKhachHang: string;
  tenKhachHang: string;
  ngayTao: string;
  ngayKetThuc: string;
  dichVuDiKem: string;
  soLuong: number;
  tienCoc: string;
  tongTien: string;
}

export let detailContractList = [
  {
    maHopDong: 'HD-0001',
    maKhachHang: 'KH-0002',
    tenKhachHang: 'Mừng',
    ngayTao: '25/04/2019',
    ngayKetThuc: '01/05/2019',
    dichVuDiKem: 'Breakfast',
    soLuong: '5',
    tienCoc: '2.000.000',
    tongTien: '7.000.000',
  },
  {
    maHopDong: 'HD-0002',
    maKhachHang: 'KH-0001',
    tenKhachHang: 'Chúc',
    ngayTao: '15/05/2020',
    ngayKetThuc: '03/06/2020',
    dichVuDiKem: 'Massage',
    soLuong: '3',
    tienCoc: '2.000.000',
    tongTien: '9.000.000',
  }
];

export interface Customer {
  maKhachHang: string;
  tenKhachHang: string;
  gioiTinh: string;
  ngaySinhKhachHang: string;
  cmndKhachHang: string;
  diaChiKhachHang: string;
  emailKhachHang: string;
  sodienthoaiKhachHang: string;
  loaiKhach: string;
}

export let customerList = [
  {
    maKhachHang: 'KH-0001',
    tenKhachHang: 'Chúc',
    gioiTinh: 'Nữ',
    ngaySinhKhachHang: '12/02/2000',
    cmndKhachHang: '123456789',
    diaChiKhachHang: 'Đà Nẵng',
    emailKhachHang: 'chuc@gmail.com',
    sodienthoaiKhachHang: '0909090909',
    loaiKhach: 'Diamond',
  },
  {
    maKhachHang: 'KH-0002',
    tenKhachHang: 'Mừng',
    gioiTinh: 'Nam',
    ngaySinhKhachHang: '15/02/2000',
    cmndKhachHang: '123456788',
    diaChiKhachHang: 'Hue',
    emailKhachHang: 'mung@gmail.com',
    sodienthoaiKhachHang: '0908080808',
    loaiKhach: 'Platinum',
  },
  {
    id: 'KH-0003',
    tenKhachHang: 'Năm',
    gioiTinh: 'Nam',
    ngaySinhKhachHang: '17/02/2000',
    cmndKhachHang: '123456777',
    diaChiKhachHang: 'Quang Nam',
    emailKhachHang: 'nam@gmail.com',
    sodienthoaiKhachHang: '0907070707',
    loaiKhach: 'Silver',
  },
  {
    maKhachHang: 'KH-0004',
    tenKhachHang: 'Mới',
    gioiTinh: 'Nữ',
    ngaySinhKhachHang: '19/02/2000',
    cmndKhachHang: '123456666',
    diaChiKhachHang: 'Hà Nội',
    emailKhachHang: 'moi@gmail.com',
    sodienthoaiKhachHang: '0906060606',
    loaiKhach: 'Member',
  }
];

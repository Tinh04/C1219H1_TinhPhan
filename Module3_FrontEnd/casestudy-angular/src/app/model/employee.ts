export interface Employee {
  maNhanVien: string;
  tenNhanVien: string;
  ngaySinhNhanVien: string;
  cmndNhanVien: string;
  diaChiNhanVien: string;
  emailNhanVien: string;
  soDienThoaiNhanVien: string;
  luong: string;
  boPhan: string;
  viTri: string;
  trinhDo: string;
}

export let employeeList = [
  {
    id: '1',
    tenNhanVien: 'Sinh',
    ngaySinhNhanVien: '24/07/1999',
    cmndNhanVien: '123456789',
    diaChiNhanVien: 'Huế',
    emailNhanVien: 'sinh@gmail.com',
    soDienThoaiNhanVien: '0901010101',
    luong: '20.000.000',
    boPhan: 'Quản Lý',
    viTri: 'Quản Lý Nhân Sự',
    trinhDo: 'Đại Học',
  },
  {
    id: '2',
    tenNhanVien: 'Nhật',
    ngaySinhNhanVien: '29/07/1990',
    cmndNhanVien: '234567899',
    diaChiNhanVien: 'Hà Nội',
    emailNhanVien: 'nhat@gmail.com',
    soDienThoaiNhanVien: '0902020202',
    luong: '50.000.000',
    boPhan: 'Hành Chính',
    viTri: 'Tổng giám đốc điều hành',
    trinhDo: 'Thạc Sĩ',
  },
  {
    id: '3',
    tenNhanVien: 'Vui',
    ngaySinhNhanVien: '22/07/1999',
    cmndNhanVien: '234567888',
    diaChiNhanVien: 'Hồ Chí Minh',
    emailNhanVien: 'vui@gmail.com',
    soDienThoaiNhanVien: '0903030303',
    luong: '10.000.000',
    boPhan: 'Phục Vụ',
    viTri: 'Lễ Tân',
    trinhDo: 'Cao Đẳng',
  },
  {
    id: '4',
    tenNhanVien: 'Vẻ',
    ngaySinhNhanVien: '25/07/1999',
    cmndNhanVien: '234567777',
    diaChiNhanVien: 'Đà Nẵng',
    emailNhanVien: 've@gmail.com',
    soDienThoaiNhanVien: '0904040404',
    luong: '12.000.000',
    boPhan: 'An Ninh',
    viTri: 'Giám Sát',
    trinhDo: 'Cao Đẳng',
  },
];

-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jul 2021 pada 11.42
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `fasilitas`
--

CREATE TABLE `fasilitas` (
  `kodeFsl` varchar(10) NOT NULL,
  `fasilitas` varchar(50) NOT NULL,
  `jenisKmr` varchar(50) NOT NULL,
  `harga` int(10) NOT NULL,
  `jumlah` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `fasilitas`
--

INSERT INTO `fasilitas` (`kodeFsl`, `fasilitas`, `jenisKmr`, `harga`, `jumlah`) VALUES
('F001A', 'Kamar', 'Kamar Premier King', 300000, 10),
('F002A', 'Kamar', 'Kamar Suite Executive', 700000, 7),
('F002S', 'Kamar', 'suite class', 50000, 5),
('F003S', 'Kamar', 'Kamar Exclusive Queen', 650000, 5),
('F004B', 'Ball Room', '', 350000, 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
--

CREATE TABLE `pembayaran` (
  `idPet` varchar(10) NOT NULL,
  `idTam` varchar(10) NOT NULL,
  `nota` varchar(25) NOT NULL,
  `totByr` varchar(50) NOT NULL,
  `viaByr` varchar(25) NOT NULL,
  `jmlBayar` varchar(50) NOT NULL,
  `kembali` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `idPes` varchar(32) CHARACTER SET utf8 NOT NULL,
  `IdTamu` varchar(50) NOT NULL,
  `IdPetugas` varchar(25) NOT NULL,
  `namaTamu` varchar(25) NOT NULL,
  `tanggalPes` datetime NOT NULL,
  `tanggalSelesai` datetime DEFAULT NULL,
  `sts` enum('check_in','check_out') DEFAULT 'check_in',
  `time_check` datetime DEFAULT NULL,
  `totalHarga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pemesanan`
--

INSERT INTO `pemesanan` (`idPes`, `IdTamu`, `IdPetugas`, `namaTamu`, `tanggalPes`, `tanggalSelesai`, `sts`, `time_check`, `totalHarga`) VALUES
('PS0000001', '1', 'P001', 'Kharisma Putri', '2021-07-04 09:44:45', '2021-07-06 09:44:45', 'check_in', '2021-07-06 09:44:45', 0),
('PS0000002', '1', 'P001', 'Kharisma Putri', '2021-07-04 16:03:04', '2021-07-04 16:03:04', 'check_in', '2021-07-04 16:03:04', 0),
('PS0000003', '3', 'P001', 'Intan Maghfiroh', '2021-07-04 16:13:47', '2021-07-04 16:13:47', 'check_in', '2021-07-04 16:13:47', 0),
('PS0000004', '1', 'P001', 'Kharisma Putri', '2021-07-04 16:18:35', '2021-07-04 16:18:35', 'check_in', '2021-07-04 16:18:35', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan_d`
--

CREATE TABLE `pemesanan_d` (
  `idPesDetail` int(11) NOT NULL,
  `idPes` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `idFasilitas` varchar(32) DEFAULT NULL,
  `hargaSatuan` int(11) DEFAULT NULL,
  `tItem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pemesanan_d`
--

INSERT INTO `pemesanan_d` (`idPesDetail`, `idPes`, `idFasilitas`, `hargaSatuan`, `tItem`) VALUES
(18, 'PS0000001', 'F001A', 300000, 2),
(20, 'PS0000002', 'F001A', 300000, 1),
(21, 'PS0000002', 'F001A', 300000, 2),
(22, 'PS0000003', 'F002A', 700000, 2),
(23, 'PS0000003', 'F003S', 650000, 1),
(24, 'PS0000004', 'F002A', 700000, 2),
(25, 'PS0000004', 'F001A', 300000, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE `petugas` (
  `idPet` varchar(10) NOT NULL,
  `namaPet` varchar(25) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jabatan` varchar(25) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`idPet`, `namaPet`, `alamat`, `jabatan`, `username`, `password`) VALUES
('P001', 'Vidya Meidita', 'Malang Kota\n', 'progammer', 'cinta', 'kamu');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tamu`
--

CREATE TABLE `tamu` (
  `idTam` int(11) NOT NULL,
  `namaTam` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jkel` enum('L','P') NOT NULL,
  `nope` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tamu`
--

INSERT INTO `tamu` (`idTam`, `namaTam`, `alamat`, `jkel`, `nope`, `email`) VALUES
(1, 'Kharisma Putri', 'blimbing malang', 'P', '91653447', 'kar@gmal.com'),
(3, 'Intan Maghfiroh', 'Jombang kota\n', 'P', '08192736457', 'nim@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `fasilitas`
--
ALTER TABLE `fasilitas`
  ADD PRIMARY KEY (`kodeFsl`);

--
-- Indeks untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`idPet`),
  ADD UNIQUE KEY `idTam` (`idTam`);

--
-- Indeks untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`idPes`);

--
-- Indeks untuk tabel `pemesanan_d`
--
ALTER TABLE `pemesanan_d`
  ADD PRIMARY KEY (`idPesDetail`),
  ADD KEY `idPes` (`idPes`);

--
-- Indeks untuk tabel `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`idPet`);

--
-- Indeks untuk tabel `tamu`
--
ALTER TABLE `tamu`
  ADD PRIMARY KEY (`idTam`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `pemesanan_d`
--
ALTER TABLE `pemesanan_d`
  MODIFY `idPesDetail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT untuk tabel `tamu`
--
ALTER TABLE `tamu`
  MODIFY `idTam` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `pemesanan_d`
--
ALTER TABLE `pemesanan_d`
  ADD CONSTRAINT `pemesanan_d_ibfk_1` FOREIGN KEY (`idPes`) REFERENCES `pemesanan` (`idPes`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

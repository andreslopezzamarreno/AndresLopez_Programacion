-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-05-2022 a las 10:40:10
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresaexamen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

DROP TABLE IF EXISTS `factura`;
CREATE TABLE IF NOT EXISTS `factura` (
  `id` text NOT NULL,
  `compania` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `pais` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `telefono` text NOT NULL,
  `total` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`id`, `compania`, `pais`, `telefono`, `total`) VALUES
('6285ed914d5314a0929270b3', 'CYTREK', 'Ireland', '(906) 572-2733', 12927),
('6285ed91102388c371a631b6', 'ZAGGLE', 'Swaziland', '(814) 591-2289', 36996),
('6285ed91e51884bb9e69a7e9', 'VIXO', 'Iraq', '(990) 591-3845', 15598),
('6285ed910e16325b6070ea26', 'IMKAN', 'Italy', '(801) 593-3810', 27148),
('6285ed912e4ff3397efd4ecc', 'GEOFORM', 'Antarctica', '(904) 452-3810', 41678),
('6285ed91c4b62095c10e775a', 'AFFLUEX', 'Saint Lucia', '(850) 489-3720', 25424),
('6285ed91c6a0706c4b316bdc', 'QUALITERN', 'Cuba', '(982) 490-2022', 26546),
('6285ed91a5c7f2cd1d9fa707', 'KONNECT', 'Tonga', '(906) 435-2278', 21741),
('6285ed91d3d964fa1bda6954', 'KEENGEN', 'Syria', '(900) 496-2046', 27813),
('6285ed91919981116998c4e3', 'OPTYK', 'Turks and Caicos Islands', '(928) 487-2809', 11479),
('6285ed91211261d3f2e04818', 'CODAX', 'Cocos (Keeling Islands)', '(841) 427-3042', 44392),
('6285ed9183f4b8ff1f1840a2', 'TELEPARK', 'Switzerland', '(850) 423-2361', 38617),
('6285ed91c25f593b59abcdb7', 'ZILLACOM', 'Uzbekistan', '(930) 509-2470', 35102),
('6285ed91a6ec8b6d6e66d171', 'QUINTITY', 'Iran', '(958) 480-3439', 37357),
('6285ed914ae4f4eea9972565', 'BOILICON', 'Burkina Faso', '(849) 490-2220', 29748),
('6285ed91564337511e7c9fa0', 'GORGANIC', 'Mauritius', '(917) 449-2672', 19787),
('6285ed917ef318d2086dad2b', 'PHARMACON', 'Nigeria', '(970) 551-2279', 20169),
('6285ed914c9bd77be5ed9628', 'GEEKOLOGY', 'Mexico', '(800) 427-2816', 30807),
('6285ed91fae557d2f635a302', 'COMVEY', 'Cambodia', '(913) 553-2397', 40550),
('6285ed91c7a72246b2927891', 'ZILPHUR', 'Libya', '(983) 408-3955', 47748),
('6285ed9138cc41fb0fd55c52', 'BEDDER', 'St. Pierre and Miquelon', '(806) 584-3341', 25805),
('6285ed91554f9a70ea1da8a2', 'UNISURE', 'Kiribati', '(980) 594-2135', 39263),
('6285ed91d64ba5c4a1b84800', 'ECRAZE', 'Pakistan', '(859) 404-3974', 12238),
('6285ed916a9062190a01aec0', 'OVERPLEX', 'Tajikistan', '(890) 505-3989', 32283),
('6285ed914606879e49a85342', 'TALKOLA', 'Benin', '(845) 478-3933', 25316),
('6285ed9165c11bb4079a2886', 'COFINE', 'Madagascar', '(816) 527-3371', 21710),
('6285ed9145b9c818338e0fcb', 'GEEKWAGON', 'China', '(811) 598-2467', 47351),
('6285ed91fffbaad3bc7a643a', 'POOCHIES', 'El Salvador', '(924) 501-3925', 15739),
('6285ed91b47c6f00eaa74e26', 'CANDECOR', 'Bangladesh', '(918) 543-3331', 30539),
('6285ed9105f514a3d3fbdcc7', 'UNI', 'San Marino', '(860) 595-2298', 35687),
('6285ed91ac9da5fd83266995', 'BEDLAM', 'Christmas Island', '(934) 407-3003', 19358),
('6285ed916b16876760423de3', 'STROZEN', 'Korea (South)', '(813) 587-2362', 30163),
('6285ed917a71ddeef3dae510', 'PREMIANT', 'Tanzania', '(862) 461-2168', 45842),
('6285ed9119db0869428ab8c5', 'POWERNET', 'Austria', '(861) 556-2708', 22274),
('6285ed911633e6689e5934de', 'EXODOC', 'Burundi', '(874) 456-3302', 34423),
('6285ed9130765a8f3539bf91', 'TURNLING', 'Liberia', '(981) 511-3951', 39888),
('6285ed91653544258ff6f643', 'FROLIX', 'Macau', '(956) 412-2718', 10511),
('6285ed914e3ef406e0378174', 'KANGLE', 'Morocco', '(937) 421-3538', 25930),
('6285ed91f022f0ef2e1cac38', 'PORTALIS', 'Macedonia', '(980) 528-3450', 18205),
('6285ed9107ecbfa2a0e94939', 'CONFRENZY', 'Belgium', '(864) 422-3654', 42207),
('6285ed912aca0a7630afff57', 'MANTRIX', 'Cayman Islands', '(938) 462-2346', 26472),
('6285ed914eb72bca8d091bc5', 'PROVIDCO', 'Kuwait', '(948) 452-3752', 18824),
('6285ed91d3746b477f1b397d', 'EXTRAGENE', 'Vanuatu', '(802) 458-3361', 36616);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `filtrada`
--

DROP TABLE IF EXISTS `filtrada`;
CREATE TABLE IF NOT EXISTS `filtrada` (
  `id` text NOT NULL,
  `compania` text NOT NULL,
  `pais` text NOT NULL,
  `telefono` text NOT NULL,
  `total` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `filtrada`
--

INSERT INTO `filtrada` (`id`, `compania`, `pais`, `telefono`, `total`) VALUES
('6285ed910e16325b6070ea26', 'IMKAN', 'Italy', '(801) 593-3810', 27148);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

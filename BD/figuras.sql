--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.0
-- Dumped by pg_dump version 9.6.0

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: puntos; Type: TABLE; Schema: public; Owner: figuras
--

CREATE TABLE puntos (
    id_pto integer NOT NULL,
    x integer,
    y integer
);


ALTER TABLE puntos OWNER TO figuras;

--
-- Name: figuras_id_pto_seq; Type: SEQUENCE; Schema: public; Owner: figuras
--

CREATE SEQUENCE figuras_id_pto_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE figuras_id_pto_seq OWNER TO figuras;

--
-- Name: figuras_id_pto_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: figuras
--

ALTER SEQUENCE figuras_id_pto_seq OWNED BY puntos.id_pto;


--
-- Name: forma; Type: TABLE; Schema: public; Owner: figuras
--

CREATE TABLE forma (
    id_pol integer NOT NULL,
    id_pto integer NOT NULL
);


ALTER TABLE forma OWNER TO figuras;

--
-- Name: poligonos; Type: TABLE; Schema: public; Owner: figuras
--

CREATE TABLE poligonos (
    id_pol integer NOT NULL
);


ALTER TABLE poligonos OWNER TO figuras;

--
-- Name: poligonos_id_pol_seq; Type: SEQUENCE; Schema: public; Owner: figuras
--

CREATE SEQUENCE poligonos_id_pol_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE poligonos_id_pol_seq OWNER TO figuras;

--
-- Name: poligonos_id_pol_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: figuras
--

ALTER SEQUENCE poligonos_id_pol_seq OWNED BY poligonos.id_pol;


--
-- Name: poligonos id_pol; Type: DEFAULT; Schema: public; Owner: figuras
--

ALTER TABLE ONLY poligonos ALTER COLUMN id_pol SET DEFAULT nextval('poligonos_id_pol_seq'::regclass);


--
-- Name: puntos id_pto; Type: DEFAULT; Schema: public; Owner: figuras
--

ALTER TABLE ONLY puntos ALTER COLUMN id_pto SET DEFAULT nextval('figuras_id_pto_seq'::regclass);


--
-- Name: figuras_id_pto_seq; Type: SEQUENCE SET; Schema: public; Owner: figuras
--

SELECT pg_catalog.setval('figuras_id_pto_seq', 13, true);


--
-- Data for Name: forma; Type: TABLE DATA; Schema: public; Owner: figuras
--

INSERT INTO forma (id_pol, id_pto) VALUES (1, 1);
INSERT INTO forma (id_pol, id_pto) VALUES (2, 2);
INSERT INTO forma (id_pol, id_pto) VALUES (2, 3);
INSERT INTO forma (id_pol, id_pto) VALUES (2, 4);
INSERT INTO forma (id_pol, id_pto) VALUES (3, 5);
INSERT INTO forma (id_pol, id_pto) VALUES (3, 6);
INSERT INTO forma (id_pol, id_pto) VALUES (3, 7);
INSERT INTO forma (id_pol, id_pto) VALUES (3, 8);
INSERT INTO forma (id_pol, id_pto) VALUES (3, 9);
INSERT INTO forma (id_pol, id_pto) VALUES (4, 11);
INSERT INTO forma (id_pol, id_pto) VALUES (4, 12);
INSERT INTO forma (id_pol, id_pto) VALUES (4, 13);


--
-- Data for Name: poligonos; Type: TABLE DATA; Schema: public; Owner: figuras
--

INSERT INTO poligonos (id_pol) VALUES (1);
INSERT INTO poligonos (id_pol) VALUES (2);
INSERT INTO poligonos (id_pol) VALUES (3);
INSERT INTO poligonos (id_pol) VALUES (4);


--
-- Name: poligonos_id_pol_seq; Type: SEQUENCE SET; Schema: public; Owner: figuras
--

SELECT pg_catalog.setval('poligonos_id_pol_seq', 4, true);


--
-- Data for Name: puntos; Type: TABLE DATA; Schema: public; Owner: figuras
--

INSERT INTO puntos (id_pto, x, y) VALUES (1, 1, 1);
INSERT INTO puntos (id_pto, x, y) VALUES (2, 2, 2);
INSERT INTO puntos (id_pto, x, y) VALUES (3, 5, 2);
INSERT INTO puntos (id_pto, x, y) VALUES (4, 5, 6);
INSERT INTO puntos (id_pto, x, y) VALUES (5, 3, 1);
INSERT INTO puntos (id_pto, x, y) VALUES (6, 8, 2);
INSERT INTO puntos (id_pto, x, y) VALUES (7, 6, 4);
INSERT INTO puntos (id_pto, x, y) VALUES (8, 5, 5);
INSERT INTO puntos (id_pto, x, y) VALUES (9, 4, 6);
INSERT INTO puntos (id_pto, x, y) VALUES (11, -2, -1);
INSERT INTO puntos (id_pto, x, y) VALUES (12, -5, -2);
INSERT INTO puntos (id_pto, x, y) VALUES (13, -3, -6);


--
-- Name: forma pk_forma; Type: CONSTRAINT; Schema: public; Owner: figuras
--

ALTER TABLE ONLY forma
    ADD CONSTRAINT pk_forma PRIMARY KEY (id_pol, id_pto);


--
-- Name: poligonos pk_poligonos; Type: CONSTRAINT; Schema: public; Owner: figuras
--

ALTER TABLE ONLY poligonos
    ADD CONSTRAINT pk_poligonos PRIMARY KEY (id_pol);


--
-- Name: puntos pk_puntos; Type: CONSTRAINT; Schema: public; Owner: figuras
--

ALTER TABLE ONLY puntos
    ADD CONSTRAINT pk_puntos PRIMARY KEY (id_pto);


--
-- Name: forma fk_forma_poligonos; Type: FK CONSTRAINT; Schema: public; Owner: figuras
--

ALTER TABLE ONLY forma
    ADD CONSTRAINT fk_forma_poligonos FOREIGN KEY (id_pol) REFERENCES poligonos(id_pol);


--
-- Name: forma fk_forma_puntos; Type: FK CONSTRAINT; Schema: public; Owner: figuras
--

ALTER TABLE ONLY forma
    ADD CONSTRAINT fk_forma_puntos FOREIGN KEY (id_pto) REFERENCES puntos(id_pto);


--
-- PostgreSQL database dump complete
--


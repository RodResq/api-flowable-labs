INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35917, 'Minutar ato', NULL, 35883, 35916, 35918, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35925, 'Término', NULL, 35883, 35918, 35931, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35933, 'Término', NULL, 35883, 35932, 35931, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35934, 'Minutar ato', NULL, 35883, 35932, 35918, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35926, 'Nó de Desvio - Preparar ato judicial', NULL, 35883, 35918, 35932, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35975, 'Minutar ato', NULL, 35941, 35974, 35976, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35984, 'Confirmar ato', NULL, 35941, 35976, 35989, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36148, 'Minutar ato de decisão', NULL, 36114, 36147, 36149, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35996, 'Término', NULL, 35941, 35989, 36002, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36005, 'Concluir ato judicial monocrático', NULL, 35941, 36002, 36010, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36016, 'Término', NULL, 35941, 36015, 36010, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36017, 'Minutar ato', NULL, 35941, 36015, 35976, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36018, 'Confirmar ato', NULL, 35941, 36015, 35989, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36019, 'Concluir ato judicial monocrático', NULL, 35941, 36015, 36002, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35997, 'Nó de Desvio - Preparar ato judicial', NULL, 35941, 35989, 36015, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(35983, 'Nó de Desvio - Preparar ato judicial', NULL, 35941, 35976, 36015, '#{true}', 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36006, 'Nó de Desvio - Preparar ato judicial', NULL, 35941, 36002, 36015, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36171, 'Retornar para minutar ato de decisão', NULL, 36114, 36162, 36149, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36157, 'Encaminhar para assinatura', NULL, 36114, 36149, 36162, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38771, 'Requisitar pagamento RPV', NULL, 38737, 38770, 38772, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38773, 'Aguardar pagamento RPV', NULL, 38737, 38772, 38774, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38775, 'Término', NULL, 38737, 38774, 38776, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36169, 'Término', NULL, 36114, 36162, 36176, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36179, 'Concluir ato judicial de decisão monocrático', NULL, 36114, 36176, 36184, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36190, 'Término', NULL, 36114, 36189, 36184, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36191, 'Minutar ato de decisão', NULL, 36114, 36189, 36149, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36192, 'Confirmar ato de decisão', NULL, 36114, 36189, 36162, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36193, 'Concluir ato judicial de decisão monocrático', NULL, 36114, 36189, 36176, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36156, 'Nó de Desvio - Preparar ato judicial de decisão', NULL, 36114, 36149, 36189, '#{true}', 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36180, 'Nó de Desvio - Preparar ato judicial de decisão', NULL, 36114, 36176, 36189, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36170, 'Nó de Desvio - Preparar ato judicial de decisão', NULL, 36114, 36162, 36189, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38778, 'Término', NULL, 38737, 38777, 38776, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36060, 'Minutar ato', NULL, 36112, 36059, 36061, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36068, 'Nó de Desvio - Preparar ato judicial', NULL, 36112, 36061, 36101, '#{true}', 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36069, 'Confirmar ato', NULL, 36112, 36061, 36074, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36081, 'Término', NULL, 36112, 36074, 36088, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36082, 'Nó de Desvio - Preparar ato judicial', NULL, 36112, 36074, 36101, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36091, 'Concluir ato judicial monocrático', NULL, 36112, 36088, 36096, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36092, 'Nó de Desvio - Preparar ato judicial', NULL, 36112, 36088, 36101, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36102, 'Término', NULL, 36112, 36101, 36096, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36103, 'Minutar ato', NULL, 36112, 36101, 36061, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36104, 'Confirmar ato', NULL, 36112, 36101, 36074, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36105, 'Concluir ato judicial monocrático', NULL, 36112, 36101, 36088, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36113, 'Retornar para minutar ato', NULL, NULL, 36074, 36061, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36083, 'Confirmar ato', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36234, 'Minutar ato de despacho', NULL, 36200, 36233, 36235, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36257, 'Retornar para minutar ato de despacho', NULL, 36200, 36248, 36235, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36243, 'Encaminhar para assinatura', NULL, 36200, 36235, 36248, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36875, 'Testa existência de expedientes', NULL, 36841, 36874, 36876, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36255, 'Término', NULL, 36200, 36248, 36262, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36265, 'Concluir ato judicial de despacho monocrático', NULL, 36200, 36262, 36270, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36276, 'Término', NULL, 36200, 36275, 36270, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36277, 'Minutar ato de despacho', NULL, 36200, 36275, 36235, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36278, 'Confirmar ato de despacho', NULL, 36200, 36275, 36248, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36279, 'Concluir ato judicial de despacho monocrático', NULL, 36200, 36275, 36262, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36242, 'Nó de Desvio - Preparar ato judicial de despacho', NULL, 36200, 36235, 36275, '#{true}', 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36877, 'Processo com prazo em curso', NULL, 36841, 36876, 36879, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38388, 'Testa existência de expedientes', NULL, 38354, 38387, 38389, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36882, 'Verifica a existência de outros expedientes', NULL, 36841, 36879, 36885, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37286, 'Arquivar processo', NULL, 37252, 37285, 37287, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36256, 'Nó de Desvio - Preparar ato judicial de despacho', NULL, 36200, 36248, 36275, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36266, 'Nó de Desvio - Preparar ato judicial de despacho', NULL, 36200, 36262, 36275, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36891, 'Processo com prazo em curso', NULL, 36841, 36888, 36879, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36886, 'Analisar manifestação', NULL, 36841, 36885, 36888, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36878, 'Término', NULL, 36841, 36876, 36893, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36320, 'Preparar comunicação', NULL, 36286, 36319, 36321, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36322, 'Término', NULL, 36286, 36321, 36325, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36327, 'Término', NULL, 36286, 36326, 36325, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36328, 'Preparar comunicação', NULL, 36286, 36326, 36321, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36323, 'Nó de Desvio - Preparar ato de comunicação', NULL, 36286, 36321, 36326, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36889, 'Término', NULL, 36841, 36888, 36893, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36887, 'Término', NULL, 36841, 36885, 36893, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36895, 'Término', NULL, 36841, 36894, 36893, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36896, 'Processo com prazo em curso', NULL, 36841, 36894, 36879, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36897, 'Analisar manifestação', NULL, 36841, 36894, 36888, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36883, 'Nó de Desvio - Controle de Prazos', NULL, 36841, 36879, 36894, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36890, 'Nó de Desvio - Controle de Prazos', NULL, 36841, 36888, 36894, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37288, 'Arquivo definitivo', NULL, 37252, 37287, 37292, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37289, 'Arquivo provisório', NULL, 37252, 37287, 37296, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37295, 'Arquivo definitivo', NULL, 37252, 37292, 37300, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37299, 'Arquivo provisório', NULL, 37252, 37296, 37306, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36735, 'Preparar comunicação', NULL, 36701, 36734, 36736, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37307, 'Desarq', NULL, 37252, 37306, 37310, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37313, 'Término', NULL, 37252, 37310, 37314, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36742, 'ForkComunicacao', NULL, 36701, 36736, 36747, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37301, 'Término', NULL, 37252, 37300, 37314, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36938, 'Arquivar processo', NULL, 36904, 36937, 36939, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36748, 'É telefone ou pessoal?', NULL, 36701, 36747, 36754, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37316, 'Arquivar processo', NULL, 37252, 37315, 37287, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36940, 'ArqDef', NULL, 36904, 36939, 36944, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36749, 'É sistema?', NULL, 36701, 36747, 36757, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37317, 'Arquivo definitivo', NULL, 37252, 37315, 37300, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36759, 'Encaminhar via sistema', NULL, 36701, 36757, 36760, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36941, 'ArqProv', NULL, 36904, 36939, 36948, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37318, 'Arquivo provisório', NULL, 37252, 37315, 37306, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36752, 'É carta precatória ou rogatória?', NULL, 36701, 36747, 36764, NULL, 4);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37319, 'Término', NULL, 37252, 37315, 37314, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36947, 'Arquivo definitivo', NULL, 36904, 36944, 36952, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37308, 'Nó de Desvio - Arquivamento', NULL, 37252, 37306, 37315, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36766, 'Visualizar carta', NULL, 36701, 36764, 36767, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37290, 'Nó de Desvio - Arquivamento', NULL, 37252, 37287, 37315, '#{true}', 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37302, 'Nó de Desvio - Arquivamento', NULL, 37252, 37300, 37315, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36750, 'É DJE?', NULL, 36701, 36747, 36775, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36951, 'Arquivo provisório', NULL, 36904, 36948, 36958, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36610, 'Preparar comunicação', NULL, 36576, 36609, 36611, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36756, 'Registra expedição de documento', NULL, 36701, 36754, 36778, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36776, 'Registra expedição de documento', NULL, 36701, 36775, 36778, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38390, 'Processo com prazo em curso', NULL, 38354, 38389, 38392, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36781, 'Deve registrar ciência?', NULL, 36701, 36778, 36782, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36959, 'Desarq', NULL, 36904, 36958, 36962, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36953, 'Término', NULL, 36904, 36952, 36966, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36617, 'ForkComunicacao', NULL, 36576, 36611, 36621, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36965, 'Término', NULL, 36904, 36962, 36966, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36622, 'É telefone ou pessoal?', NULL, 36576, 36621, 36628, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36968, 'Arquivar processo', NULL, 36904, 36967, 36939, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36969, 'Arquivo definitivo', NULL, 36904, 36967, 36952, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36970, 'Arquivo provisório', NULL, 36904, 36967, 36958, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36971, 'Término', NULL, 36904, 36967, 36966, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36954, 'Nó de Desvio - Arquivamento', NULL, 36904, 36952, 36967, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36942, 'Nó de Desvio - Arquivamento', NULL, 36904, 36939, 36967, '#{true}', 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36960, 'Nó de Desvio - Arquivamento', NULL, 36904, 36958, 36967, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38395, 'Verifica a existência de outros expedientes', NULL, 38354, 38392, 38398, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38404, 'Aguardar demais manifestações', NULL, 38354, 38401, 38392, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38399, 'Analisar manifestação', NULL, 38354, 38398, 38401, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38391, 'Término', NULL, 38354, 38389, 38406, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38402, 'Ignorar demais manifestações', NULL, 38354, 38401, 38406, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38400, 'Término', NULL, 38354, 38398, 38406, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38408, 'Término', NULL, 38354, 38407, 38406, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37566, 'Retornar para minutar ato de julgamento', NULL, 37506, 37557, 37544, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38409, 'Processo com prazo em curso', NULL, 38354, 38407, 38392, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38410, 'Analisar manifestação', NULL, 38354, 38407, 38401, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38403, 'Nó de Desvio - Controle de Prazos', NULL, 38354, 38401, 38407, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(38396, 'Nó de Desvio - Controle de Prazos', NULL, 38354, 38392, 38407, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(37564, 'Finalizar ato de julgamento', NULL, 37506, 37557, 37571, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36623, 'É sistema?', NULL, 36576, 36621, 36631, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36633, 'Encaminhar via sistema', NULL, 36576, 36631, 36634, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36626, 'É carta precatória ou rogatória?', NULL, 36576, 36621, 36638, NULL, 4);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36640, 'Visualizar carta', NULL, NULL, 36638, 36641, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36624, 'É DJE?', NULL, 36576, 36621, 36647, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36630, 'Registra expedição de documento', NULL, 36576, 36628, 36650, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36648, 'Registra expedição de documento', NULL, 36576, 36647, 36650, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36653, 'Deve registrar ciência?', NULL, 36576, 36650, 36654, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36655, 'Publicar DJE', NULL, 36576, 36654, 36657, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36656, 'Registrar ciência', NULL, 36576, 36654, 36663, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36625, 'É mandado?', NULL, 36576, 36621, 36667, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36668, 'Tem uma central?', NULL, 36576, 36667, 36669, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36671, 'Selecionar central de mandados', NULL, 36576, 36669, 36672, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36676, 'Encaminhar central de mandados', NULL, 36576, 36672, 36680, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36670, 'Encaminhar central de mandados', NULL, 36576, 36669, 36680, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36627, 'É correios?', NULL, 36576, 36621, 36684, NULL, 5);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36649, 'JoinComunicacao', NULL, 36576, 36647, 36686, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36685, 'JoinComunicacao', NULL, 36576, 36684, 36686, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36666, 'JoinComunicacao', NULL, 36576, 36663, 36686, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36659, 'JoinComunicacao', NULL, 36576, 36657, 36686, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36639, 'JoinComunicacao', NULL, 36576, 36638, 36686, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36642, 'JoinComunicacao', NULL, 36576, 36641, 36686, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36632, 'JoinComunicacao', NULL, 36576, 36631, 36686, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36683, 'JoinComunicacao', NULL, 36576, 36680, 36686, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36637, 'JoinComunicacao', NULL, 36576, 36634, 36686, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36629, 'JoinComunicacao', NULL, 36576, 36628, 36686, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36687, 'Término', NULL, 36576, 36686, 36688, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36690, 'Término', NULL, 36576, 36689, 36688, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36691, 'Preparar comunicação', NULL, 36576, 36689, 36611, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36692, 'Selecionar central de mandados', NULL, 36576, 36689, 36672, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36693, 'Publicar DJE', NULL, 36576, 36689, 36657, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36694, 'Visualizar carta', NULL, 36576, 36689, 36641, NULL, 4);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36658, 'Nó de Desvio - Preparar ato de comunicação', NULL, 36576, 36657, 36689, '#{true}', 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36643, 'Nó de Desvio - Preparar ato de comunicação', NULL, 36576, 36641, 36689, '#{true}', 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36616, 'Nó de Desvio - Preparar ato de comunicação', NULL, 36576, 36611, 36689, '#{true}', 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36675, 'Nó de Desvio - Preparar ato de comunicação', NULL, 36576, 36672, 36689, '#{true}', 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36783, 'Publicar DJE', NULL, 36701, 36782, 36785, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36784, 'Registrar ciência', NULL, 36701, 36782, 36791, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36751, 'É mandado?', NULL, 36701, 36747, 36795, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36796, 'Tem uma central?', NULL, 36701, 36795, 36797, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36799, 'Selecionar central de mandados', NULL, 36701, 36797, 36800, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36804, 'Encaminhar central de mandados', NULL, 36701, 36800, 36808, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36798, 'Encaminhar central de mandados', NULL, 36701, 36797, 36808, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36753, 'É correios?', NULL, 36701, 36747, 36812, NULL, 5);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36814, 'Registrar expedição de AR', NULL, NULL, 36812, 36815, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36818, 'Imprimir correspondência', NULL, NULL, 36815, 36819, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36813, 'JoinComunicacao', NULL, 36701, 36812, 36825, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36755, 'JoinComunicacao', NULL, 36701, 36754, 36825, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36821, 'JoinComunicacao', NULL, NULL, 36819, 36825, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36777, 'JoinComunicacao', NULL, 36701, 36775, 36825, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36765, 'JoinComunicacao', NULL, 36701, 36764, 36825, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36763, 'JoinComunicacao', NULL, 36701, 36760, 36825, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36794, 'JoinComunicacao', NULL, 36701, 36791, 36825, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36811, 'JoinComunicacao', NULL, 36701, 36808, 36825, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36787, 'JoinComunicacao', NULL, 36701, 36785, 36825, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36770, 'JoinComunicacao', NULL, 36701, 36767, 36825, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36758, 'JoinComunicacao', NULL, 36701, 36757, 36825, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36826, 'Término', NULL, 36701, 36825, 36827, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36743, 'Não intimar', NULL, NULL, 36736, 36827, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36829, 'Término', NULL, 36701, 36828, 36827, NULL, 0);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36830, 'Preparar comunicação', NULL, 36701, 36828, 36736, NULL, 1);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36831, 'Selecionar central de mandados', NULL, 36701, 36828, 36800, NULL, 2);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36832, 'Publicar DJE', NULL, 36701, 36828, 36785, NULL, 3);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36833, 'Visualizar carta', NULL, 36701, 36828, 36767, NULL, 4);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36834, 'Imprimir correspondência', 'teste', 36701, 36828, 36819, NULL, 5);
INSERT INTO public.jbpm_transition
(id_, name_, description_, processdefinition_, from_, to_, condition_, fromindex_)
VALUES(36803, 'Nó de Desvio - Preparar ato de comunicação', NULL, 36701, 36800, 36828, '#{true}', 0);
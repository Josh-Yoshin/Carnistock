@echo off
title Orquestador de Microservicios - CarniStock
echo ====================================================
echo    INICIANDO LOS 10 MICROSERVICIOS EN MASA
echo ====================================================

echo 1. Iniciando ms-productos...
start "ms-productos" cmd /k "cd ms-productos && mvnw spring-boot:run"

echo 2. Iniciando ms-inventario-stock...
start "ms-inventario-stock" cmd /k "cd ms-inventario-stock && mvnw spring-boot:run"

echo 3. Iniciando ms-lotes-vencimiento...
start "ms-lotes-vencimiento" cmd /k "cd ms-lotes-vencimiento && mvnw spring-boot:run"

echo 4. Iniciando ms-proveedores...
start "ms-proveedores" cmd /k "cd ms-proveedores && mvnw spring-boot:run"

echo 5. Iniciando ms-compras-recepcion...
start "ms-compras-recepcion" cmd /k "cd ms-compras-recepcion && mvnw spring-boot:run"

echo 6. Iniciando ms-produccion-desposte...
start "ms-produccion-desposte" cmd /k "cd ms-produccion-desposte && mvnw spring-boot:run"

echo 7. Iniciando ms-mermas-calidad...
start "ms-mermas-calidad" cmd /k "cd ms-mermas-calidad && mvnw spring-boot:run"

echo 8. Iniciando ms-pedidos-ventas...
start "ms-pedidos-ventas" cmd /k "cd ms-pedidos-ventas && mvnw spring-boot:run"

echo 9. Iniciando ms-clientes-mayoristas...
start "ms-clientes-mayoristas" cmd /k "cd ms-clientes-mayoristas && mvnw spring-boot:run"

echo 10. Iniciando ms-empleados-roles...
start "ms-empleados-roles" cmd /k "cd ms-empleados-roles && mvnw spring-boot:run"

echo ====================================================
echo     TODOS LOS SERVICIOS HAN SIDO LANZADOS
echo ====================================================
pause
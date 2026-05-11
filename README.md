# PaySecure – Project Documentation

This repository contains all documentation related to the PaySecure
Cloud & DevOps Engineer capstone project.

# paysecure-app
PaySecure Application is a lightweight backend service built using Java and Spring Boot to simulate a payment-status API.
The application is containerized with Docker and deployed on Amazon EKS using Kubernetes manifests, demonstrating real-world DevOps, cloud-native, and container orchestration practices.

This repository focuses on the application, containerization, and Kubernetes deployment layer, while infrastructure provisioning is managed separately using Terraform.

## Contents
- Decision log and architecture rationale
- Security and PCI-DSS alignment
- Observability and SRE metrics
- Disaster recovery strategy
- Architecture diagrams and pitch deck
- Demo walkthrough and reflections

## Audience
- CTO / Technical leadership
- DevOps and SRE teams
- Interviewers and recruiters

## Architecture Overview

PaySecure is designed as a highly available, secure fintech payment platform
deployed on AWS using Kubernetes and Infrastructure as Code principles.

The platform uses Amazon EKS for container orchestration, Amazon RDS PostgreSQL
with read replicas for data durability, and GitOps-based CI/CD pipelines
for safe and repeatable deployments.

# PaySecure – Decision Log

## Primary Cloud Provider
Chosen: AWS  
Reason: Mature managed services, strong EKS + RDS HA support, PCI-DSS-friendly offerings.

## Container Orchestration
Chosen: Kubernetes (EKS)  
Reason: Auto-scaling, portability, GitOps compatibility.

## Database
Chosen: Amazon RDS PostgreSQL (Multi-AZ)  
Reason: Managed HA, automated backups, encryption, easier PCI-DSS alignment.

## CI/CD Strategy
Chosen: GitHub Actions (GitOps-style)  
Reason: Native Git integration, auditability, automation.

## Observability
Chosen: Prometheus + Grafana  
Reason: Industry standard, deep Kubernetes & DB metrics.

## Security Strategy
Chosen: IAM least privilege, private networking, secrets management, encryption everywhere.
